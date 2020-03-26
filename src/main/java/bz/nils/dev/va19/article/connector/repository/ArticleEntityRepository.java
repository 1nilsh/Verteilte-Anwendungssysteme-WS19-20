package bz.nils.dev.va19.article.connector.repository;

import bz.nils.dev.va19.article.connector.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleEntityRepository extends JpaRepository<ArticleEntity, Long> {
}
