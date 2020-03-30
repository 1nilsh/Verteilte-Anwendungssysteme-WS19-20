package bz.nils.dev.va19.order.connector;

import bz.nils.dev.va19.order.component.behaviour.OrderService;
import bz.nils.dev.va19.order.component.structure.Order;
import bz.nils.dev.va19.order.component.structure.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RequestMapping("api/order")
@RestController
public class OrderRestConnectorProvider {
    private final OrderService orderService;

    @Autowired
    public OrderRestConnectorProvider(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        return this.orderService.createOrder(order);
    }

    @RequestMapping(value = "/{orderId}", method = POST)
    public void addItemToOrder(@RequestBody OrderItem orderItem, @PathVariable String orderId) {
        this.orderService.addItemToOrder(orderItem, orderId);
    }

    @GetMapping
    public List<Order> readOrderList() {
        return this.orderService.readOrderList();
    }

}
