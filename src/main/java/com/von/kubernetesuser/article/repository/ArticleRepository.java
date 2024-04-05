package com.von.kubernetesuser.article.repository;


import com.von.kubernetesuser.article.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}