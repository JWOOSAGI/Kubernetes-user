package com.von.kubernetesuser.article;

import com.von.kubernetesuser.common.command.CommandService;
import com.von.kubernetesuser.common.query.QueryService;

import java.util.*;

public interface ArticleService extends CommandService<Article>, QueryService<Article> {

    default Article dtoToEntitiy(ArticleDTO dto){

        Article article = Article.builder()
                .content(dto.getContent())
                .build();

        return article;
    }

    default Optional<ArticleDTO> entityToDto(Article ent){
        ArticleDTO dto = ArticleDTO.builder()

                .content(ent.getContent())
                .build();

        return  Optional.of(dto);
    }

}
