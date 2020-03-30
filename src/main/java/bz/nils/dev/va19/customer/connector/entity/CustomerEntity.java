package bz.nils.dev.va19.customer.connector.entity;


import bz.nils.dev.va19.customer.component.structure.Cart;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class CustomerEntity {

    @Id
    String uuid;
    String name;
    String address;
    @OneToOne(cascade = CascadeType.ALL)
    CartEntity cart;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCart(CartEntity cart) {
        this.cart = cart;
    }

    public CartEntity getCart() {
        return this.cart;
    }

}
