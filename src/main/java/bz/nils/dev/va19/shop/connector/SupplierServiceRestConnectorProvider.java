package bz.nils.dev.va19.shop.connector;

import bz.nils.dev.va19.shop.component.behaviour.Shop;
import bz.nils.dev.va19.shop.component.behaviour.SupplierShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierServiceRestConnectorProvider implements SupplierShopService {
    private final Shop shop;

    @Autowired
    public SupplierServiceRestConnectorProvider(Shop shop) {
        this.shop = shop;
    }

    @Override
    @RequestMapping(value = "supplierservice/article/new", method = RequestMethod.POST)
    public void addArticleFromSupplier(@RequestBody Object article) {
        shop.createNewArticle(article);
    }
}
