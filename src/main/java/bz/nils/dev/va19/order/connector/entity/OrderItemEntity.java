package bz.nils.dev.va19.order.connector.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderItemEntity {
    @Id
    private String uuid;
    private String containedArticleId;
    private int articleQuantity;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContainedArticleId() {
        return containedArticleId;
    }

    public void setContainedArticleId(String containedArticleId) {
        this.containedArticleId = containedArticleId;
    }

    public int getArticleQuantity() {
        return articleQuantity;
    }

    public void setArticleQuantity(int articleQuantity) {
        this.articleQuantity = articleQuantity;
    }
}
