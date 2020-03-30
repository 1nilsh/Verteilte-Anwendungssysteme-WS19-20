package bz.nils.dev.va19.article;

import bz.nils.dev.va19.article.component.behaviour.ArticleService;
import bz.nils.dev.va19.article.component.structure.Article;
import bz.nils.dev.va19.article.connector.ArticleEntityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
@DataJpaTest
class ArticleApplicationTests {

	Article article1;
	Article article2;

    @Autowired
    private ArticleService articleService;
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private ArticleEntityRepository articleEntityRepository;


	@BeforeEach
	void startUp() {

		article1 = new Article();
		article1.setManufacturer("Werkhaus");
		article1.setName("Stift");
		article1.setPrice(12f);

		article2 = new Article();
		article1.setManufacturer("Werkhaus");
		article1.setName("Stift");
		article1.setPrice(12f);

	}

    @Test
    void contextLoads() {
    }

    @Test
    void isArticleCreated() throws Exception {
        Assert.notNull(articleService.createArticle(article1));
    }

    @Test
    void isArticleListReturned() throws Exception {

        articleService.createArticle(article1);
        articleService.createArticle(article2);

        Assert.notEmpty(articleService.readArticleList());

    }

}
