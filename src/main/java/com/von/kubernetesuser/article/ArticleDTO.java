package com.von.kubernetesuser.article;

import com.von.kubernetesuser.board.Board;
import com.von.kubernetesuser.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
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
