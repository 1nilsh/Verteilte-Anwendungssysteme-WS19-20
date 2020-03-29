package bz.nils.dev.va19.shop.component.behaviour;

import bz.nils.dev.va19.shop.connector.ArticleRestConnectorRequester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerShopService {
    private final ArticleRestConnectorRequester articleRestConnectorRequester;

    @Autowired
    public CustomerShopService(ArticleRestConnectorRequester articleRestConnectorRequester) {
        this.articleRestConnectorRequester = articleRestConnectorRequester;
    }

    public List<Object> listArticles() {
        return articleRestConnectorRequester.readArticleList();
    }

    public int createNewCustomer(Object customer) {
        int customerID = 0;// Placeholder for real logic
        System.out.println("createNewCustomer() called!");
        return customerID;

    }


    public int checkoutCart(Object customerID) {
        int orderID = 0; //Placeholder for real logic
        //order gets assigned to customer
        System.out.println("createOrder() called!");
        return orderID;
    }


    // public void addArticleToCart(Object customerID, Object articleID);
    //public void removeArticleFromCart(Object customerID, Object articleID);
    //public Object searchArticle(Object ArticleID); --> readArticle
}
