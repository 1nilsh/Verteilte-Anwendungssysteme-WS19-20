package bz.nils.dev.va19.customer.connector.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartItemEntity {

    @Id
    private String cartItemId;
    private int articleQuantity;
    private String containedArticleId;

    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getArticleQuantity() {
        return articleQuantity;
    }

    public void setArticleQuantity(int quantity) {
        this.articleQuantity = quantity;
    }

    public String getContainedArticleId() {
        return containedArticleId;
    }

    public void setContainedArticleId(String articleId) {
        this.containedArticleId = articleId;
    }
}
