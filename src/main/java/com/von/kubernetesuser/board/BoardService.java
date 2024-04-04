package com.von.kubernetesuser.board;

import com.von.kubernetesuser.article.Article;
import com.von.kubernetesuser.article.ArticleDTO;
import com.von.kubernetesuser.common.command.CommandService;
import com.von.kubernetesuser.common.query.QueryService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BoardService extends CommandService, QueryService {

    default Map<String, ?> dtoToEntitiy(ArticleDTO dto){
        Map<String, Article> map = new HashMap<>();

        Article article = Article.builder()

                .build();

        map.put("article", article);

        List<ArticleDTO> articleDTOList = new ArrayList<>();

        // boardId 로 DB를 조회해서 해당 게시판에 게시된 글의 목록을 가져올 경우


        return map;
    }

    default ArticleDTO entityToDTO(Article article){
        ArticleDTO dto = ArticleDTO.builder()

                .build();
        return dto;
    }

}
