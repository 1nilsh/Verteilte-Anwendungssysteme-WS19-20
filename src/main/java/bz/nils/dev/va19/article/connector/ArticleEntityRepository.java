package bz.nils.dev.va19.article.connector;

import bz.nils.dev.va19.article.component.structure.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleEntityRepository extends JpaRepository<ArticleEntity, String> {
}
