package bz.nils.dev.va19.article.dao;

import bz.nils.dev.va19.article.model.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleEntityRepository extends JpaRepository<ArticleEntity, Long> {
}
