package com.von.kubernetesuser.article.service;

import com.von.kubernetesuser.article.model.Article;
import com.von.kubernetesuser.article.model.ArticleDTO;
import com.von.kubernetesuser.common.service.CommandService;
import com.von.kubernetesuser.common.service.QueryService;

import java.util.*;

public interface ArticleService extends CommandService<ArticleDTO>, QueryService<ArticleDTO> {

    default Article dtoToEntity(ArticleDTO dto){
        return Article.builder().build();
    }

    default ArticleDTO entityToDTO(Optional<Article> optional){
        return ArticleDTO.builder().build();
    }

}
