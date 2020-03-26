package bz.nils.dev.va19.shop.service;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<Integer, Object> readCustomers() {

        Map<Integer, Object> customers = new HashMap<Integer, Object>(); //placeholder for real logic
        System.out.println("readCustomers() called!");
        return customers;
    }
}
