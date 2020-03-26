package bz.nils.dev.va19.customer.connector;

import bz.nils.dev.va19.customer.component.behaviour.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/customer")
    @RestController
    public class CustomerRestConnectorProvider {
        private final CustomerService customerService;

        @Autowired
        public CustomerRestConnectorProvider(CustomerService customerService){
            this.customerService=customerService;
        }



}
