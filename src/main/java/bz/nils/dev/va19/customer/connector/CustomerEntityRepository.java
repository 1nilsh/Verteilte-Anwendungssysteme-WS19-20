package bz.nils.dev.va19.customer.connector;

import bz.nils.dev.va19.customer.component.structure.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Long> {
}
