package bz.nils.dev.va19.article.connector;

import bz.nils.dev.va19.article.component.behaviour.ArticleService;
import bz.nils.dev.va19.article.component.structure.Article;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleRestConnectorProviderTest {

    private MockMvc mockMvc;

    @Mock
    private ArticleService articleService;

    @InjectMocks
    private ArticleRestConnectorProvider articleRestConnectorProvider;

    private String dummyArticleId;
    private Article dummyArticle;
    private List<Article> dummyArticleList;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(articleRestConnectorProvider).build();

        dummyArticleId = "a668f13e-770c-4336-be39-1988abec066e";

        dummyArticle = new Article();
        dummyArticle.setUuid(UUID.fromString(dummyArticleId));
        dummyArticle.setName("iPhone 8 Plus");
        dummyArticle.setManufacturer("Apple Inc.");
        dummyArticle.setPrice(899.99f);

        dummyArticleList = new ArrayList<>();
        dummyArticleList.add(dummyArticle);
    }

    @Test
    public void testGetArticleList() throws Exception {
        Mockito.when(articleService.readArticleList()).thenReturn(dummyArticleList);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/article"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testReadSingleArticle() throws Exception {
        Mockito.when(articleService.readSingleArticle(dummyArticleId)).thenReturn(dummyArticle);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/article/" + dummyArticleId))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testCreateArticle() throws Exception {
        Mockito.when(articleService.createArticle(dummyArticle)).thenReturn(dummyArticleId);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/article")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"uuid\":\"a668f13e-770c-4336-be39-1988abec066e\", \"name\":\"iPhone 8 Plus\", \"manufacturer\":\"Apple Inc.\", \"price\":\"899.99\" }"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
