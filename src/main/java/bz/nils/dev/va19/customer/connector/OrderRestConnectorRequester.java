package bz.nils.dev.va19.customer.connector;

import bz.nils.dev.va19.customer.component.structure.CartItem;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.stereotype.Service;

@Service
public class OrderRestConnectorRequester {
    private OrderRestConnectorInterface orderRestConnectorInterface;

    public OrderRestConnectorRequester() {
        orderRestConnectorInterface = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(OrderRestConnectorInterface.class, "http://localhost:8090/order-microservice/api/order");
    }


    public String createOrder(String customerId) {
        return this.orderRestConnectorInterface.createOrder(customerId);
    }

    public void addItemToOrder(CartItem item, String orderId) {
        this.orderRestConnectorInterface.addItemToOrder(item, orderId);
    }
}
