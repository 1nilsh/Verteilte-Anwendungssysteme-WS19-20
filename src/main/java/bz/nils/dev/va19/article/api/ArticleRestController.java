package bz.nils.dev.va19.article.api;

import bz.nils.dev.va19.article.model.Article;
import bz.nils.dev.va19.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/article")
@RestController
public class ArticleRestController {
    private final ArticleService articleService;

    @Autowired
    public ArticleRestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public void createArticle(@RequestBody Article article) {
        articleService.createArticle(article);
    }

    @GetMapping
    public List<Article> getArticleList() {
        return articleService.readArticleList();
    }
}
