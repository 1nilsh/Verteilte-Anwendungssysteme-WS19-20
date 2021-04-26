package bz.nils.dev.va19.shop.connector;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface ArticleRestConnectorInterface {
    @RequestLine("GET")
    List<Object> readArticleList();

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    String createArticle(Object article);

    @RequestLine("GET/{articleId}")
    @Headers("Content-Type: application/json")
    Object readArticle(@Param("articleId") Object articleId);
}
