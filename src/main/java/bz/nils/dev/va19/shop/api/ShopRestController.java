package bz.nils.dev.va19.shop.api;

import bz.nils.dev.va19.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class ShopRestController {
    private final ShopService shopService;

    @Autowired
    public ShopRestController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping
    public void createNewCustomer(@RequestBody Object customer) {
        shopService.createNewCustomer(customer);
    }
}
