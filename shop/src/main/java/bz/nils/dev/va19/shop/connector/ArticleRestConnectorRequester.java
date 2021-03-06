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
                .target(ArticleRestConnectorInterface.class, "http://localhost:8090/article-microservice/api/article");
    }

    public List<Object> readArticleList() {
        return articleRestConnectorInterface.readArticleList();
    }

    public String createArticle(Object article) {
        return articleRestConnectorInterface.createArticle(article);
    }

    public Object readArticle(Object articleID) {
        return articleRestConnectorInterface.readArticle(articleID);
    }
}
