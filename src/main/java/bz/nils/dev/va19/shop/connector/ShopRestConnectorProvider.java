package bz.nils.dev.va19.shop.connector;

import bz.nils.dev.va19.shop.component.behaviour.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopRestConnectorProvider {
    private final Shop shop;

    @Autowired
    public ShopRestConnectorProvider(Shop shop) {
        this.shop = shop;
    }

    @RequestMapping(value = "api/customer", method = RequestMethod.POST)
    public void createNewCustomer(@RequestBody Object customer) {
        shop.createNewCustomer(customer);
    }

    /*@RequestMapping(value = "api/customer", method = RequestMethod.GET)
    //public List<Object> readCustomers() {
        return shop.readCustomers();
    }*/

    /*@RequestMapping(value = "api/article", method = RequestMethod.POST)
    public void createNewArticle(@RequestBody Object article) {
        shop.createNewArticle(article);
    }
*/
    @RequestMapping(value = "api/article", method = RequestMethod.GET)
    public List<Object> readArticleList() {
        return shop.readArticleList();
    }

    @RequestMapping(value = "api/order", method = RequestMethod.POST)
    public int createOrder(@RequestBody Object customerID) {
        return shop.createOrder(customerID);
    }


}
