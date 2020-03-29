package bz.nils.dev.va19.order.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class OrderItem {
    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("parentOrderId")
    private String parentOrderId;

    @JsonProperty("containedArticleId")
    private String containedArticleId;

    @JsonProperty("articleQuantity")
    private int articleQuantity;

    public OrderItem() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
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
