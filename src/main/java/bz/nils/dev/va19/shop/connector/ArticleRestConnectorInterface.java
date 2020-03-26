package bz.nils.dev.va19.shop.connector;

import feign.Headers;
import feign.RequestLine;

import java.util.List;

public interface ArticleRestConnectorInterface {
    @RequestLine("GET")
    List<Object> readArticleList();

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void createArticle(Object article);
}
