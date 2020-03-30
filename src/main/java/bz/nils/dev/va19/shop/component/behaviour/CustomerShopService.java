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
        return customerID;

    }


    public String checkoutCart(String customerID) {
        return customerRestConnectorRequester.createOrder(customerID);
    }

    public void addArticleToCart(String customerID, String articleID) {
        customerRestConnectorRequester.updateCart(customerID, articleID);
    }

    public void removeArticleFromCart(String customerID, String articleID) {
        customerRestConnectorRequester.deleteArticleInCart(customerID, articleID);
    }

    public Object searchArticle(Object articleID) {
        Object article = articleRestConnectorRequester.readArticle(articleID);
        return article;
    }

}
