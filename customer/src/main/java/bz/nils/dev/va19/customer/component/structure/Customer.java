package bz.nils.dev.va19.customer.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.UUID;

public class Customer {
    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("cart")
    private Cart cart;

    public Customer() {
        this.uuid = UUID.randomUUID().toString();
        this.cart = new Cart();
    }

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

    public void setCart(Cart cart){
        this.cart = cart;
    }

    public Cart getCart(){
        return this.cart;
    }
}


