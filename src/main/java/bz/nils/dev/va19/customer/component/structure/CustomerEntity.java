package bz.nils.dev.va19.customer.component.structure;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CustomerEntity {

    @Id
    String uuid;
    String name;
    String address;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
