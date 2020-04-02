package bz.nils.dev.va19.shop.component.behaviour;

import bz.nils.dev.va19.shop.connector.ArticleRestConnectorRequester;
import bz.nils.dev.va19.shop.connector.CustomerRestConnectorRequester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerShopService {
    private final ArticleRestConnectorRequester articleRestConnectorRequester;
    private final CustomerRestConnectorRequester customerRestConnectorRequester;


    @Autowired
    public CustomerShopService(ArticleRestConnectorRequester articleRestConnectorRequester, CustomerRestConnectorRequester customerRestConnectorRequester) {
        this.articleRestConnectorRequester = articleRestConnectorRequester;
        this.customerRestConnectorRequester = customerRestConnectorRequester;
    }

    public List<Object> listArticles() {
        return articleRestConnectorRequester.readArticleList();
    }

    public String createNewCustomer(Object customer) {
        return customerRestConnectorRequester.createCustomer(customer);

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
        return articleRestConnectorRequester.readArticle(articleID);
    }

}
