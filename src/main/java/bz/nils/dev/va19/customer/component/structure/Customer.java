package bz.nils.dev.va19.customer.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.UUID;

public class Customer {

 //   @JsonProperty("uuid")
    private UUID uuid;

   // @JsonProperty("name")
    private String name;

   // @JsonProperty("address")
    private String adress;

   // @JsonProperty("cart")
    private Cart cart;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
