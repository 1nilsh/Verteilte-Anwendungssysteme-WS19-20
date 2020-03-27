package bz.nils.dev.va19.shop.component.behaviour;

import bz.nils.dev.va19.shop.connector.ArticleRestConnectorRequester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Shop {
    private final ArticleRestConnectorRequester articleRestConnectorRequester;

    @Autowired
    public Shop(ArticleRestConnectorRequester articleRestConnectorRequester) {
        this.articleRestConnectorRequester = articleRestConnectorRequester;
    }

    public boolean createNewCustomer(Object customer) {
        // Placeholder for real logic
        System.out.println("createNewCustomer() called!");
        return true;
    }

    public void createNewArticle(Object article) {
        articleRestConnectorRequester.createArticle(article);
    }

    public List<Object> readArticleList() {
        return articleRestConnectorRequester.readArticleList();
    }

    public int createOrder(Object customerID) {


        int orderID = 0; //Placeholder for real logic
        //order gets assigned to customer
        System.out.println("createOrder() called!");
        return orderID;
    }

    public List<Object> readCustomers() {

        List<Object> customers = new ArrayList<Object>(); //placeholder for real logic
        System.out.println("readCustomers() called!");
        return customers;
    }
}
