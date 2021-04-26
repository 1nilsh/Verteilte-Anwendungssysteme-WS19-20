package bz.nils.dev.va19.article.component.behaviour;

import bz.nils.dev.va19.article.component.structure.Article;
import bz.nils.dev.va19.article.connector.entity.ArticleEntity;
import bz.nils.dev.va19.article.connector.repository.ArticleEntityRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleServiceTest {

    @Mock
    private ArticleEntityRepository dataService;

    @InjectMocks
    private ArticleService articleService;

    private Article dummyArticle;
    private List<Article> dummyArticleList;

    private ArticleEntity dummyArticleEntity;
    private List<ArticleEntity> dummyArticleEntityList;

    @Before
    public void setUp() {
        /* Article */
        dummyArticle = new Article();
        dummyArticle.setUuid(UUID.fromString("884ab3b8-74d8-11ea-bc55-0242ac130003"));
        dummyArticle.setName("iPhone 8 Plus");
        dummyArticle.setManufacturer("Apple Inc.");
        dummyArticle.setPrice(899.99f);

        dummyArticleList = new ArrayList<>();
        dummyArticleList.add(dummyArticle);

        /* Entity */
        dummyArticleEntity = new ArticleEntity();
        dummyArticleEntity.setUuid("884ab3b8-74d8-11ea-bc55-0242ac130003");
        dummyArticleEntity.setName("iPhone 8 Plus");
        dummyArticleEntity.setManufacturer("Apple Inc.");
        dummyArticleEntity.setPrice(899.99f);

        dummyArticleEntityList = new ArrayList<>();
        dummyArticleEntityList.add(dummyArticleEntity);
    }

    @Test
    public void testCreateArticle() {
        String createdArticleId = articleService.createArticle(dummyArticle);
        Assert.assertEquals(dummyArticle.getUuid(), createdArticleId);
    }

    @Test
    public void testReadArticleList() {
        Mockito.when(dataService.findAll()).thenReturn(dummyArticleEntityList);

        List<Article> foundArticles = articleService.readArticleList();

        Assert.assertEquals(dummyArticleList.size(), foundArticles.size());
    }

    @Test
    public void testReadSingleArticle() {
        Mockito.when(dataService.getOne(dummyArticleEntity.getUuid())).thenReturn(dummyArticleEntity);

        Article foundArticle = articleService.readSingleArticle(dummyArticle.getUuid());

        Assert.assertEquals(dummyArticle.getManufacturer(), foundArticle.getManufacturer());
        Assert.assertEquals(dummyArticle.getName(), foundArticle.getName());
        Assert.assertEquals(dummyArticle.getPrice(), foundArticle.getPrice(), 0.001);
    }
}
