package bz.nils.dev.va19.order.connector;

import bz.nils.dev.va19.order.component.structure.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEntityRepository extends JpaRepository<OrderEntity, Long> {
}
