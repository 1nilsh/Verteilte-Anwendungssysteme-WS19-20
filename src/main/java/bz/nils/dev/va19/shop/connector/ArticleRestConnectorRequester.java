package bz.nils.dev.va19.shop.connector;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleRestConnectorRequester {
    private ArticleRestConnectorInterface articleRestConnectorInterface;

    public ArticleRestConnectorRequester() {
        articleRestConnectorInterface = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(ArticleRestConnectorInterface.class, "http://localhost:8080/api/article");
    }

    public List<Object> readArticleList() {
        return this.articleRestConnectorInterface.readArticleList();
    }

    public void createArticle(Object article) {
        this.articleRestConnectorInterface.createArticle(article);
    }
}
