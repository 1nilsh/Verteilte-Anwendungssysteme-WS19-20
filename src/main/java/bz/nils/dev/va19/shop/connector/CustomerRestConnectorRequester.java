package bz.nils.dev.va19.shop.connector;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerRestConnectorRequester {
    private CustomerRestConnectorInterface customerRestConnectorInterface;

    public CustomerRestConnectorRequester() {
        customerRestConnectorInterface = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(CustomerRestConnectorInterface.class, "http://localhost:8090/customer-microservice/api/customer");
    }

    public List<Object> readCustomerList() {
        return customerRestConnectorInterface.readCustomerList();
    }

    public String createCustomer(Object customer) {
        return customerRestConnectorInterface.createCustomer(customer);
    }


    public void updateCart(Object customerID, Object articleID) {
        customerRestConnectorInterface.updateCart(customerID, articleID);
    }

    public Object createOrder(Object customerID) {
        return customerRestConnectorInterface.createOrder(customerID);
    }

    public void deleteArticleInCart(Object customerID, Object articleID) {
        customerRestConnectorInterface.deleteArticleInCart(customerID, articleID);
    }
}
