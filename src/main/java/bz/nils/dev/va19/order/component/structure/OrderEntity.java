package bz.nils.dev.va19.order.component.structure;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderEntity {

    @Id
    private String uuid;
    private String header;
    private String body;
    private String footer;



    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
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
