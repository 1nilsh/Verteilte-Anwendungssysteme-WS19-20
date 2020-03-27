package bz.nils.dev.va19.customer.connector;

import bz.nils.dev.va19.customer.component.behaviour.CustomerService;
import bz.nils.dev.va19.customer.component.structure.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/customer")
@RestController
public class CustomerRestConnectorProvider {
    private final CustomerService customerService;

    @Autowired
    public CustomerRestConnectorProvider(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {

        customerService.createCustomer(customer);

    }

}
