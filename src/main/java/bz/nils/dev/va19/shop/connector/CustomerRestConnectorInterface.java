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

    @RequestLine("PATCH/{customerID}/{articleID}")
    @Headers("Content-Type: application/json")
    void updateCart(@Param("customerID") String customerID, @Param("articleID") String articleID);

    @RequestLine("POST/{customerId}")
    @Headers("Content-Type: application/json")
    Object createOrder(@Param("customerId") String customerID);

    @RequestLine("DELETE/{customerID}/{articleID}")
    @Headers("Content-Type: application/json")
    void deleteArticleInCart(@Param("customerID") String customerID, @Param("articleID") String articleID);
}
