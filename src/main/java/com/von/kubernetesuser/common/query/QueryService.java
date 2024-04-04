package com.von.kubernetesuser.common.query;

import com.von.kubernetesuser.article.ArticleDTO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


public interface QueryService<T> {
    List<T> findAll() throws SQLException;
    Optional<ArticleDTO> findById(Long id);
    String count();
    Optional<T> getOne(String id);
    Boolean existsById(Long id);
}