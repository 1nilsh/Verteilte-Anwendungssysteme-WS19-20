package bz.nils.dev.va19.shop.connector;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface CustomerRestConnectorInterface {

    @RequestLine("GET")
    List<Object> readCustomerList();


    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    String createCustomer(Object customer);

    @RequestLine("PATCH")
    @Headers("Content-Type: application/json")
    void updateCart(Object customerID, Object articleID);

    @RequestLine("POST/{customerId}")
    Object createOrder(@Param("customerId") Object customerID);

    @RequestLine("DELETE")
    void deleteArticleInCart(Object customerID, Object articleID);
}
