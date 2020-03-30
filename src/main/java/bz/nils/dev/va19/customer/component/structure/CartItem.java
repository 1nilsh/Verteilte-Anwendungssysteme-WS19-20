package bz.nils.dev.va19.customer.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class CartItem {
    @JsonProperty("cartItemId")
    private UUID cartItemId;
    @JsonProperty("articleQuantity")
    private int articleQuantity;
    @JsonProperty("containedArticleId")
    private String containedArticleId;

    public CartItem() {
        this.cartItemId = UUID.randomUUID();
    }

    public UUID getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(UUID cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getQuantity() {
        return articleQuantity;
    }

    public void setQuantity(int quantity) {
        this.articleQuantity = quantity;
    }

    public String getContainedArticleId() {
        return containedArticleId;
    }

    public void setContainedArticleId(String containedArticleId) {
        this.containedArticleId = containedArticleId;
    }
}
