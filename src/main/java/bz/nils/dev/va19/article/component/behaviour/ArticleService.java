package bz.nils.dev.va19.article.component.behaviour;

import bz.nils.dev.va19.article.connector.repository.ArticleEntityRepository;
import bz.nils.dev.va19.article.connector.entity.ArticleEntity;
import bz.nils.dev.va19.article.component.structure.Article;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    private final ArticleEntityRepository dataService;
    Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();

    @Autowired
    public ArticleService(ArticleEntityRepository dataService) {
        this.dataService = dataService;
    }

    public boolean createArticle(Article article) {
        ArticleEntity entity = mapper.map(article, ArticleEntity.class);

        try {
            dataService.saveAndFlush(entity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Article> readArticleList() {
        List<Article> articles = new ArrayList<>();
        mapper.map(dataService.findAll(), articles);
        return articles;
    }
}
