package bz.nils.dev.va19.article.connector;

import bz.nils.dev.va19.article.component.structure.Article;
import bz.nils.dev.va19.article.component.behaviour.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("api/article")
@RestController
public class ArticleRestConnectorProvider {
    private final ArticleService articleService;

    @Autowired
    public ArticleRestConnectorProvider(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public String createArticle(@RequestBody Article article) throws Exception {
        articleService.createArticle(article);
        return article.getUuid().toString();
    }


    @GetMapping
    public List<Article> getArticleList() {
        return articleService.readArticleList();
    }

    @GetMapping("/{articleId}")
    public Article readSingleArticle(@PathVariable String articleId) {
        return articleService.readSingleArticle(articleId);
    }
}
