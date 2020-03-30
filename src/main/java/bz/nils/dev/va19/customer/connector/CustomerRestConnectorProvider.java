package bz.nils.dev.va19.customer.connector;

import bz.nils.dev.va19.customer.component.behaviour.CustomerService;
import bz.nils.dev.va19.customer.component.structure.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("api/customer")
@RestController
public class CustomerRestConnectorProvider {
    private final CustomerService customerService;

    @Autowired
    public CustomerRestConnectorProvider(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) throws Exception {
        customerService.createCustomer(customer);
        return customer.getUuid().toString();

    }

    @GetMapping
    public List<Customer> getArticleList() {
        return customerService.readCustomerList();
    }


}
