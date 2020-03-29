package bz.nils.dev.va19.shop.component.behaviour;

import bz.nils.dev.va19.shop.connector.ArticleRestConnectorRequester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierShopService {
    private final ArticleRestConnectorRequester articleRestConnectorRequester;

    @Autowired
    public SupplierShopService(ArticleRestConnectorRequester articleRestConnectorRequester) {
        this.articleRestConnectorRequester = articleRestConnectorRequester;
    }

    // TODO: Slotos will als Parameter (Set<Article>)
    public void addArticleFromSupplier(Object article) {
        articleRestConnectorRequester.createArticle(article);
    }
}
