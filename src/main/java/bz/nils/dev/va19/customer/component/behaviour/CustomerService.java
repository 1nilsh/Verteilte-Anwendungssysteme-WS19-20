package bz.nils.dev.va19.customer.component.behaviour;

import bz.nils.dev.va19.customer.component.structure.Cart;
import bz.nils.dev.va19.customer.component.structure.CartItem;
import bz.nils.dev.va19.customer.component.structure.Customer;
import bz.nils.dev.va19.customer.connector.OrderRestConnectorRequester;
import bz.nils.dev.va19.customer.connector.entity.CustomerEntity;
import bz.nils.dev.va19.customer.connector.repository.CustomerEntityRepository;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerEntityRepository dataService;
    Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
    private final OrderRestConnectorRequester orderRestConnectorRequester;

    @Autowired
    public CustomerService(CustomerEntityRepository dataService, OrderRestConnectorRequester orderRestConnectorRequester) {
        this.dataService = dataService;
        this.orderRestConnectorRequester = orderRestConnectorRequester;
    }


    public String createCustomer(Customer customer) throws Exception {
        CustomerEntity entity = mapper.map(customer, CustomerEntity.class);


        try {
            dataService.saveAndFlush(entity);
            return entity.getUuid();
        } catch (Exception e) {

            Logger logger = LoggerFactory.getLogger(this.getClass());
            logger.error("Cannot persist Customer");

            throw e;
        }

    }

    public List<Customer> readCustomerList() {
        List<Customer> customers = new ArrayList<>();
        mapper.map(dataService.findAll(), customers);
        return customers;
    }

    public void updateCart(String customerId, String articleId) {
        Customer customer = mapper.map(dataService.getOne(customerId), Customer.class);

        customer.getCart().addCartItemtoCart(articleId, 1);

        dataService.saveAndFlush(mapper.map(customer, CustomerEntity.class));
    }


    public void deleteArticleInCart(String customerId, String articleId) {
        Customer customer = mapper.map(dataService.getOne(customerId), Customer.class);

        customer.getCart().deleteCartItemFromCart(articleId);
        dataService.saveAndFlush(mapper.map(customer, CustomerEntity.class));
    }

    public String createOrder(String customerId) {
        Customer customer = readSingleCustomer(customerId);
        Cart cart = customer.getCart();
        String orderId = orderRestConnectorRequester.createOrder(customerId);

        for ( CartItem item: cart.getCartItems()
             ) {
            orderRestConnectorRequester.addItemToOrder(item, orderId);
        }

        return orderId;


    }

    public Customer readSingleCustomer(String customerId) {
        Customer customer = mapper.map(dataService.getOne(customerId), Customer.class);
        return customer;
    }
}
