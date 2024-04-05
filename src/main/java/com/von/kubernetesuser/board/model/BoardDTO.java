package com.von.kubernetesuser.board.model;

import com.von.kubernetesuser.article.model.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BoardDTO {

    private Long id;
    private String title;
    private String content;
    private String registerDate;

    private List<Article> articles;

}
