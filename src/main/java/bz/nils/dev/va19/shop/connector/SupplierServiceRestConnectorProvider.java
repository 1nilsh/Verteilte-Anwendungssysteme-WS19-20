package bz.nils.dev.va19.shop.connector;

import bz.nils.dev.va19.shop.component.behaviour.SupplierShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierServiceRestConnectorProvider {
    private final SupplierShopService shop;

    @Autowired
    public SupplierServiceRestConnectorProvider(SupplierShopService shop) {
        this.shop = shop;
    }

    @RequestMapping(value = "api/supplier/article/new", method = RequestMethod.POST)
    public void addArticleFromSupplier(@RequestBody Object article) {
        shop.addArticleFromSupplier(article);
    }
}
