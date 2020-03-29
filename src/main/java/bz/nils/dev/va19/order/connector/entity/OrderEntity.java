package bz.nils.dev.va19.order.connector.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderEntity {

    @Id
    private String uuid;
    private String orderingCustomerId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItemEntity> orderItems;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrderingCustomerId() {
        return orderingCustomerId;
    }

    public void setOrderingCustomerId(String orderingCustomerId) {
        this.orderingCustomerId = orderingCustomerId;
    }

    public List<OrderItemEntity> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemEntity> orderItems) {
        this.orderItems = orderItems;
    }

    public void addOrderItem(OrderItemEntity orderItem) {
        if (orderItems == null) {
            orderItems = new ArrayList<OrderItemEntity>();
        }
        this.orderItems.add(orderItem);
    }
}
