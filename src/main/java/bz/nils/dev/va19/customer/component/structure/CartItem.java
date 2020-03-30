package bz.nils.dev.va19.customer.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class CartItem {
    @JsonProperty("cartItemId")
    private String cartItemId;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("articleId")
    private String articleId;

    public CartItem() {
        this.cartItemId = UUID.randomUUID().toString();
    }

    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}
