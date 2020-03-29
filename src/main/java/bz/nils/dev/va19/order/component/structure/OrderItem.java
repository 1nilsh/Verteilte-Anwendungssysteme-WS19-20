package bz.nils.dev.va19.order.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class OrderItem {
    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("containedArticleId")
    private String containedArticleId;

    @JsonProperty("articleQuantity")
    private int articleQuantity;

    public OrderItem() {
        this.uuid = UUID.randomUUID();
    }

    public String getUuid() {
        return uuid.toString();
    }

    public void setUuid(String uuid) {
        this.uuid = UUID.fromString(uuid);
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
