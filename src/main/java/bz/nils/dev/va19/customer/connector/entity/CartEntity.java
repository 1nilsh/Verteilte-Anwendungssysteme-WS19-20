package bz.nils.dev.va19.customer.connector.entity;

import bz.nils.dev.va19.customer.component.structure.CartItem;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class CartEntity {

    @Id
    String cartId;
    String numberOfCartItems;

    @OneToMany(cascade = CascadeType.ALL)
    List<CartItemEntity> cartItems;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getNumberOfCartItems() {
        return numberOfCartItems;
    }

    public void setNumberOfCartItems(String numberOfCartItems) {
        this.numberOfCartItems = numberOfCartItems;
    }

    public List<CartItemEntity> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemEntity> cartItems) {
        this.cartItems = cartItems;
    }
}


