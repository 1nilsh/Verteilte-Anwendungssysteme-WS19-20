package bz.nils.dev.va19.shop.connector;

import bz.nils.dev.va19.shop.component.behaviour.CustomerShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerShopServiceRestConnectorProvider {
    private final CustomerShopService customerShopService;

    @Autowired
    public CustomerShopServiceRestConnectorProvider(CustomerShopService customerShopService) {
        this.customerShopService = customerShopService;
    }

    @RequestMapping(value = "api/customer/article/all", method = RequestMethod.GET)
    public List<Object> listArticles() {
        return customerShopService.listArticles();
    }

    @RequestMapping(value = "api/customer/new", method = RequestMethod.POST)
    public String createNewCustomer(@RequestBody Object customer) {
        return customerShopService.createNewCustomer(customer);

    }

    @RequestMapping(value = "api/customer/cart/checkout", method = RequestMethod.POST)
    public Object checkoutCart(@RequestBody String customerID) {
        return customerShopService.checkoutCart(customerID);
    }

    @RequestMapping(value = "api/customer/cart/add{customerID}/{articleID}", method = RequestMethod.PATCH)
    public void addArticleToCart(@PathVariable String customerId, @PathVariable String articleID) {
        customerShopService.addArticleToCart(customerId, articleID);
    }

    @RequestMapping(value = "api/customer/cart/remove/{customerID}/{articleID}", method = RequestMethod.DELETE)
    public void removeArticleFromCart(@PathVariable String customerID, @PathVariable String articleID) {
        customerShopService.removeArticleFromCart(customerID, articleID);
    }

    @RequestMapping(value = "api/customer/article/{articleId}", method = RequestMethod.GET)
    public Object searchArticle(@PathVariable String articleID) {
        return customerShopService.searchArticle(articleID);
    }

}
