package bz.nils.dev.va19.customer.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class CartItem {
    @JsonProperty("cartItemId")
    private UUID cartItemId;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("articleId")
    private String articleId;

    public CartItem(String articleId, int quantity) {
        this.cartItemId = UUID.randomUUID();
    }

    public UUID getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(UUID cartItemId) {
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
