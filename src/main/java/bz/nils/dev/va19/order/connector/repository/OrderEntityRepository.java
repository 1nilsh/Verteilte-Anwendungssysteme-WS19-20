package bz.nils.dev.va19.order.connector.repository;

import bz.nils.dev.va19.order.connector.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEntityRepository extends JpaRepository<OrderEntity, String> {
}
