package bz.nils.dev.va19.shop.api;

import bz.nils.dev.va19.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ShopRestController {
    private final ShopService shopService;

    @Autowired
    public ShopRestController(ShopService shopService) {
        this.shopService = shopService;
    }

    @RequestMapping(value = "api/customer", method = RequestMethod.POST)
    public void createNewCustomer(@RequestBody Object customer) {
        shopService.createNewCustomer(customer);
    }

    @RequestMapping(value = "api/customer", method = RequestMethod.GET)
    public Map<Integer, Object> readCustomers(){
        return shopService.readCustomers();
    }

    @RequestMapping(value = "api/article", method = RequestMethod.POST)
    public void createNewArticle(@RequestBody Object article) {
        shopService.createNewArticle(article);
    }

    @RequestMapping(value = "api/article", method = RequestMethod.GET)
    public List<Object> readArticleList() {
        return shopService.readArticleList();
    }

    @RequestMapping(value = "api/order", method = RequestMethod.POST)
    public int createOrder(@RequestBody Object customerID) {return shopService.createOrder(customerID);}



}
