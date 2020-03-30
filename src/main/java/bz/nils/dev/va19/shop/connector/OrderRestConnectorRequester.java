package bz.nils.dev.va19.shop.connector;

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


}
