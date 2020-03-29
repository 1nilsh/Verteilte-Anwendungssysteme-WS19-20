package bz.nils.dev.va19.order.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Order {
    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("orderingCustomerId")
    private String orderingCustomerId;

    public Order() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getOrderingCustomerId() {
        return orderingCustomerId;
    }

    public void setOrderingCustomerId(String orderingCustomerId) {
        this.orderingCustomerId = orderingCustomerId;
    }
}
