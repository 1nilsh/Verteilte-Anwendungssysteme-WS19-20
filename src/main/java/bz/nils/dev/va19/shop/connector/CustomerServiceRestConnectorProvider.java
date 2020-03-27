package bz.nils.dev.va19.shop.connector;

import bz.nils.dev.va19.shop.component.behaviour.CustomerShopService;
import bz.nils.dev.va19.shop.component.behaviour.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerServiceRestConnectorProvider implements CustomerShopService {
    private final Shop shop;

    @Autowired
    public CustomerServiceRestConnectorProvider(Shop shop) {
        this.shop = shop;
    }

    @Override
    @RequestMapping(value = "customerservice/articles", method = RequestMethod.GET)
    public List<Object> listArticles() {
        return shop.readArticleList();
    }

    @Override
    @RequestMapping(value = "customerservice/new", method = RequestMethod.POST)
    public void createNewCustomer(@RequestBody Object customer) {
        shop.createNewCustomer(customer);

    }

    @Override
    @RequestMapping(value = "customerservice/checkout", method = RequestMethod.POST)
    public int checkoutCart(@RequestBody Object customerID) {
        return shop.createOrder(customerID);
    }
}
