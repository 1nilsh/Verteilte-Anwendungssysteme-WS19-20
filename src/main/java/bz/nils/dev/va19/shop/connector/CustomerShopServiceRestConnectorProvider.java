package bz.nils.dev.va19.shop.connector;

import bz.nils.dev.va19.shop.component.behaviour.CustomerShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerShopServiceRestConnectorProvider {
    private final CustomerShopService customerShopService;

    @Autowired
    public CustomerShopServiceRestConnectorProvider(CustomerShopService customerShopService) {
        this.customerShopService = customerShopService;
    }

    @RequestMapping(value = "api/customer/articles", method = RequestMethod.GET)
    public List<Object> listArticles() {
        return customerShopService.listArticles();
    }

    @RequestMapping(value = "api/customer/new", method = RequestMethod.POST)
    public Object createNewCustomer(@RequestBody Object customer) {
        return customerShopService.createNewCustomer(customer);

    }

    @RequestMapping(value = "api/customer/cart/checkout", method = RequestMethod.POST)
    public int checkoutCart(@RequestBody Object customerID) {
        return customerShopService.checkoutCart(customerID);
    }

    @RequestMapping(value = "api/customer/cart/add")
    public void addArticleToCart(Object customerId, Object articleID) {
        customerShopService.addArticleToCart(customerId, articleID);
    }

}
