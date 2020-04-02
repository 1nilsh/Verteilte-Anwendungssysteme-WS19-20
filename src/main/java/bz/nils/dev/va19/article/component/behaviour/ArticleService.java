package bz.nils.dev.va19.article.component.behaviour;

import bz.nils.dev.va19.article.component.structure.Article;
import bz.nils.dev.va19.article.connector.entity.ArticleEntity;
import bz.nils.dev.va19.article.connector.repository.ArticleEntityRepository;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    public String createArticle(Article article) {
        ArticleEntity entity = mapper.map(article, ArticleEntity.class);

        try {
            dataService.saveAndFlush(entity);
            return entity.getUuid();
        } catch (Exception e) {

            Logger logger = LoggerFactory.getLogger(this.getClass());
            logger.error("Cannot persist Article");

            throw e;
        }
    }

    public List<Article> readArticleList() {
        List<ArticleEntity> articleEntities = dataService.findAll();
        List<Article> articles = new ArrayList<>();

        articleEntities.forEach(articleEntity -> articles.add(mapper.map(articleEntity, Article.class)));
        return articles;
    }

    public Article readSingleArticle(String articleId) {
        return mapper.map(dataService.getOne(articleId), Article.class);
    }
}
