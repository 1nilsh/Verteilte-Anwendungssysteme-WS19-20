package bz.nils.dev.va19.customer.connector.repository;

import bz.nils.dev.va19.customer.connector.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, String> {
}
