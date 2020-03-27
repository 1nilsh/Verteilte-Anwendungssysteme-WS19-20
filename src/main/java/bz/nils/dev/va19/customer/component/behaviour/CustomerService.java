package bz.nils.dev.va19.customer.component.behaviour;

import bz.nils.dev.va19.customer.component.structure.Customer;
import bz.nils.dev.va19.customer.component.structure.CustomerEntity;
import bz.nils.dev.va19.customer.connector.CustomerEntityRepository;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerEntityRepository dataService;
    Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();

    @Autowired
    public CustomerService(CustomerEntityRepository dataService) {
        this.dataService = dataService;
    }


    public boolean createCustomer(Customer customer) {
        CustomerEntity entity = mapper.map(customer, CustomerEntity.class);


        try {

            dataService.saveAndFlush(entity);

            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
