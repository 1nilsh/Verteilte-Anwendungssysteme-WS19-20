package bz.nils.dev.va19.customer.connector;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface OrderRestConnectorInterface {

    @RequestLine("POST/{customerId}")
    @Headers("Content-Type: application/json")
    String createOrder(@Param("customerId") String customerId);

    @RequestLine("POST/{orderId}")
    @Headers("Content-Type: application/json")
    void addItemToOrder( Object orderItem, @Param("orderId") String orderId);
}
