package com.von.kubernetesuser.board.model;

import com.von.kubernetesuser.article.model.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
@Data // getter, settter, toString

@Component
public class BoardDTO {
    private Long id;
    private String boardName;
    private String boardType;

    private List<Article> articles ;

    private String regDate;
    private String modDate;
}