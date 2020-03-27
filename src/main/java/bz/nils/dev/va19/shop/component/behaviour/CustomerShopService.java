package bz.nils.dev.va19.shop.component.behaviour;

import java.util.List;

public interface CustomerShopService {
    List<Object> listArticles();

    void createNewCustomer(Object customer);

    int checkoutCart(Object customerID);
    // public void addArticleToCart(Object customerID, Object articleID);
    //public void removeArticleFromCart(Object customerID, Object articleID);
    //public Object searchArticle(Object ArticleID); --> readArticle
}
