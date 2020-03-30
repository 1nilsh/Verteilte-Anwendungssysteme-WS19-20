package bz.nils.dev.va19.article;

import bz.nils.dev.va19.article.component.behaviour.ArticleService;
import bz.nils.dev.va19.article.component.structure.Article;
import bz.nils.dev.va19.article.connector.ArticleEntityRepository;
import bz.nils.dev.va19.article.connector.ArticleRestConnectorProvider;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.RequestBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.net.http.HttpClient;

import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
//@RunWith(JUnitPlatform.class)
public class ArticleRestConnectorProviderTest {


    /*
    @InjectMocks
    ArticleRestConnectorProvider articleRestConnectorProvider;

    @Mock
    ArticleEntityRepository articleEntityRepository;
    @Autowired
    ArticleService articleService = new ArticleService(articleEntityRepository)
*/

    @Test
    void createArticle() {

     //   articleService.readArticleList();


    }

}
