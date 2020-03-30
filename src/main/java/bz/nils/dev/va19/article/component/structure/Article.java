package bz.nils.dev.va19.article.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Article {
    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("price")
    private float price;

    public Article() {
        this.uuid = UUID.randomUUID();
    }

    public String getUuid() {
        return uuid.toString();
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
