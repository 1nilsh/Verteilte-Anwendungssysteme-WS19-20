package bz.nils.dev.va19.order.connector;

import bz.nils.dev.va19.order.component.behaviour.OrderService;
import bz.nils.dev.va19.order.component.structure.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/order")
@RestController
public class OrderRestConnectorProvider {
    private final OrderService orderService;

    @Autowired
    public OrderRestConnectorProvider(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }


}
