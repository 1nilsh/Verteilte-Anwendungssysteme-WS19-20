package bz.nils.dev.va19.customer.component.structure;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class CustomerEntity {

    @Id
    UUID uuid;
    String name;
    String adress;
    Cart cart;

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
