package bz.nils.dev.va19.order.component.structure;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Order {
    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("header")
    private String header;

    @JsonProperty("body")
    private String body;

    @JsonProperty("footer")
    private String footer;

    public Order(){this.uuid = UUID.randomUUID();};

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }


}
