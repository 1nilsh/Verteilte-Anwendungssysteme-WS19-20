package bz.nils.dev.va19.customer.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Cart {
    @JsonProperty("cartId")
    private String cartId;
    @JsonProperty("numberOfCartItems")
    private int numberOfCartItems;
    @JsonProperty("cartItems")
    private List<CartItem> cartItems;

    public Cart() {
        this.cartId = UUID.randomUUID().toString();
        cartItems = new ArrayList<CartItem>();
    }


    public String getCartId() {
        return cartId.toString();
    }


    public void setCartId(String cartId) {
        this.cartId = cartId;
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
        CartItem newCartItem = new CartItem();
        newCartItem.setQuantity(quantity);
        newCartItem.setArticleId(articleId);

        if (cartItems.size() == 0) {

            cartItems.add(newCartItem);
        } else {
            for (CartItem cartItem : cartItems) {

                if (cartItem.getArticleId().equals(articleId)) {
                    cartItem.setQuantity(cartItem.getQuantity() + 1);
                } else {
                    cartItems.add(newCartItem);
                }

            }
        }

        increaseNumberOfCartItems(quantity);

    }

    public void increaseNumberOfCartItems(int amount) {
        numberOfCartItems += amount;
    }

    public void decreaseNumberOfCartItems(int amount) {
        numberOfCartItems -= amount;
    }

    public void deleteCartItemFromCart(String articleId) {
        CartItem cartItemToRemove = null;

        for (CartItem cartItem : cartItems) {

            if (cartItem.getArticleId().equals(articleId) && cartItem.getQuantity() == 1) {
                cartItemToRemove = cartItem;
            } else if (cartItem.getArticleId().equals(articleId)) {
                cartItem.setQuantity(cartItem.getQuantity() - 1);
            }
        }

        cartItems.remove(cartItemToRemove);
        decreaseNumberOfCartItems(1);

    }
}
