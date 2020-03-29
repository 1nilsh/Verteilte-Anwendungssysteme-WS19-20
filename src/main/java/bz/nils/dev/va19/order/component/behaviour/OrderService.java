package bz.nils.dev.va19.order.component.behaviour;

import bz.nils.dev.va19.order.component.structure.Order;
import bz.nils.dev.va19.order.connector.entity.OrderEntity;
import bz.nils.dev.va19.order.connector.repository.OrderEntityRepository;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


        private final OrderEntityRepository dataService;
    Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();

    @Autowired
    public OrderService(OrderEntityRepository dataService) {
        this.dataService = dataService;
    }

    public Boolean createOrder(Order order) {
        OrderEntity entity = mapper.map(order, OrderEntity.class);
        //Todo implement logic
        try {
            dataService.saveAndFlush(entity);
            return true;

        } catch (Exception e) {
            return false;
        }




    }


}
