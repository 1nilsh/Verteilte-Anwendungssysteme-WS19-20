package bz.nils.dev.va19.shop.component.behaviour;

import bz.nils.dev.va19.shop.connector.ArticleRestConnectorRequester;
import bz.nils.dev.va19.shop.connector.CustomerRestConnectorRequester;
import bz.nils.dev.va19.shop.connector.OrderRestConnectorRequester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerShopService {
    private final ArticleRestConnectorRequester articleRestConnectorRequester;
    private final CustomerRestConnectorRequester customerRestConnectorRequester;
    private final OrderRestConnectorRequester orderRestConnectorRequester;


    @Autowired
    public CustomerShopService(ArticleRestConnectorRequester articleRestConnectorRequester, CustomerRestConnectorRequester customerRestConnectorRequester, OrderRestConnectorRequester orderRestConnectorRequester) {
        this.articleRestConnectorRequester = articleRestConnectorRequester;
        this.customerRestConnectorRequester = customerRestConnectorRequester;
        this.orderRestConnectorRequester = orderRestConnectorRequester;
    }

    public List<Object> listArticles() {
        return articleRestConnectorRequester.readArticleList();
    }

    public String createNewCustomer(Object customer) {
        String customerID = customerRestConnectorRequester.createCustomer(customer);
        System.out.println("createNewCustomer() called!");
        return customerID;

    }


    public Object checkoutCart(Object customerID) {
        Object Order = customerRestConnectorRequester.createOrder(customerID);
        System.out.println("createOrder() called!");
        return 0;
    }

    public void addArticleToCart(Object customerID, Object articleID) {
        customerRestConnectorRequester.updateCart(customerID, articleID);
    }

    public void removeArticleFromCart(Object customerID, Object articleID) {
        customerRestConnectorRequester.deleteArticleInCart(customerID, articleID);
    }

    public Object searchArticle(Object articleID) {
        Object article = articleRestConnectorRequester.readArticle(articleID);
        return article;
    }

}
