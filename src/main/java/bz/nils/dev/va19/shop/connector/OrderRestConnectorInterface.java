package bz.nils.dev.va19.shop.connector;

import feign.Headers;
import feign.RequestLine;

import java.util.List;

public interface OrderRestConnectorInterface {

    @RequestLine("GET")
    List<Object> readOrderList();

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void createOrder(Object customerID);
}
