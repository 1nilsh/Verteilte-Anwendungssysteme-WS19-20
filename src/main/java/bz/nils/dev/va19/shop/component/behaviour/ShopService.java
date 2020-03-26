package bz.nils.dev.va19.shop.component.behaviour;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {
    public boolean createNewCustomer(Object customer) {
        // Placeholder for real logic
        System.out.println("createNewCustomer() called!");
        return true;
    }

    public boolean createNewArticle(Object article) {
        //Placeholder for real logic
        System.out.println("createNewArticle() called!");
        return true;
    }

    public List<Object> readArticleList() {

        List<Object> articleList = new ArrayList<Object>(); //Placeholder for real logic
        System.out.println("ReadArticleList() called!");
        return articleList;
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
