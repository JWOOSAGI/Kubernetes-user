package com.von.kubernetesuser.article.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ArticleDTO {

    private Long id;
    private String title;
    private String content;
    private String registerDate;

    private Long userId;
    private Long boardId;
}
