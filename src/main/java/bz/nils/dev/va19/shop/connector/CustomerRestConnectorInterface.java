package bz.nils.dev.va19.shop.connector;

import feign.Headers;
import feign.RequestLine;

import java.util.List;

public interface CustomerRestConnectorInterface {

    @RequestLine("GET")
    List<Object> readCustomerList();


    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    Object createCustomer(Object customer);

    @RequestLine("PATCH")
    @Headers("Content-Type: application/json")
    void updateCart(Object customerID, Object articleID);
}
