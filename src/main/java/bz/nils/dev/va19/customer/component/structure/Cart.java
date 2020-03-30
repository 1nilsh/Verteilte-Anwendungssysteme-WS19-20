package bz.nils.dev.va19.customer.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Cart {
    @JsonProperty("cartId")
    private UUID cartId;
    @JsonProperty("numberOfCartItems")
    private int numberOfCartItems;
    @JsonProperty("cartItems")
    private List<CartItem> cartItems;

    public Cart() {
        this.cartId = UUID.randomUUID();
        cartItems = new ArrayList<CartItem>();
    }


    public String getCartId() {
        return cartId.toString();
    }


    public void setCartId(String cartId) {
        this.cartId = UUID.fromString(cartId);
    }


    public int getNumberOfCartItems() {
        return numberOfCartItems;
    }

    public void setNumberOfCartItems(int numberOfCartItems) {
        this.numberOfCartItems = numberOfCartItems;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }


    public void addCartItemtoCart(String articleId, int quantity) {

        /*
        quantity = 1;

        if (!cartItems.containsKey(articleId)) {
            cartItems.put(articleId, new CartItem(articleId, quantity));
        } else {
            cartItems.get(articleId).setQuantity(cartItems.get(articleId).getQuantity() + 1);
        }
        numberOfCartItems++;


         */
    }

    public void deleteCartItemFromCart(String articleId) {

        /*
        if (cartItems.get(articleId).getQuantity() == 1) {
            cartItems.remove(articleId);
        } else {
            cartItems.get(articleId).setQuantity(cartItems.get(articleId).getQuantity() - 1);
        }

         */

    }
}
