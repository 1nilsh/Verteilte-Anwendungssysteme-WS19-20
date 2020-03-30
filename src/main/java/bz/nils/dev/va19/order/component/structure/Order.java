package bz.nils.dev.va19.order.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {
    @JsonProperty("uuid")
    private UUID uuid;

    private Date localDate;

    @JsonProperty("orderingCustomerId")
    private String orderingCustomerId;

    @JsonProperty("orderItems")
    private List<OrderItem> orderItems;

    public Order() {
        this.uuid = UUID.randomUUID();
        localDate = new Date();
    }

    public String getUuid() {
        return uuid.toString();
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date localDate) {
        this.localDate = localDate;
    }

    public void setUuid(String uuid) {
        this.uuid = UUID.fromString(uuid);
    }

    public String getOrderingCustomerId() {
        return orderingCustomerId;
    }

    public void setOrderingCustomerId(String orderingCustomerId) {
        this.orderingCustomerId = orderingCustomerId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void addOrderItem(OrderItem orderItem) {
        if (orderItems == null) {
            orderItems = new ArrayList<OrderItem>();
        }
        this.orderItems.add(orderItem);
    }
}
