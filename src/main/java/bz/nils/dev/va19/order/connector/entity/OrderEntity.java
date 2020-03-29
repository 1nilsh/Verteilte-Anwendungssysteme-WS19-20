package bz.nils.dev.va19.order.connector.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderEntity {

    @Id
    private String uuid;
    private String orderingCustomerId;

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
}
