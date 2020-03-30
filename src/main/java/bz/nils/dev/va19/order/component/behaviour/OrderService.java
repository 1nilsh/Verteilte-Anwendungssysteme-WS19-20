package bz.nils.dev.va19.order.component.behaviour;

import bz.nils.dev.va19.order.component.structure.Order;
import bz.nils.dev.va19.order.component.structure.OrderItem;
import bz.nils.dev.va19.order.connector.entity.OrderEntity;
import bz.nils.dev.va19.order.connector.repository.OrderEntityRepository;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final OrderEntityRepository dataService;
    Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();

    @Autowired
    public OrderService(OrderEntityRepository dataService) {
        this.dataService = dataService;
    }

    public String createOrder(Order order) {
        OrderEntity entity = mapper.map(order, OrderEntity.class);
        try {
            dataService.saveAndFlush(entity);
            return order.getUuid();
        } catch (Exception e) {
            Logger logger = LoggerFactory.getLogger(this.getClass());
            logger.error("Cannot persist Order");

            throw e;
        }
    }

    public void addItemToOrder(OrderItem orderItem, String orderId) {
        Order order = mapper.map(dataService.getOne(orderId), Order.class);
        order.addOrderItem(orderItem);
        createOrder(order);
    }

    public List<Order> readOrderList() {
        List<Order> orders = new ArrayList<>();
        mapper.map(dataService.findAll(), orders);
        return orders;
    }

}
