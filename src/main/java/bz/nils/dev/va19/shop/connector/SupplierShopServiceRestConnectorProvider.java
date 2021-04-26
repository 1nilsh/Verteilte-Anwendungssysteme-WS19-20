package bz.nils.dev.va19.shop.connector;

import bz.nils.dev.va19.shop.component.behaviour.SupplierShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierShopServiceRestConnectorProvider {
    private final SupplierShopService shop;

    @Autowired
    public SupplierShopServiceRestConnectorProvider(SupplierShopService shop) {
        this.shop = shop;
    }

    @RequestMapping(value = "api/supplier/article/new", method = RequestMethod.POST)
    public String addArticleFromSupplier(@RequestBody Object article) {
        return shop.addArticleFromSupplier(article);
    }
}
