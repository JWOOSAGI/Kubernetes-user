package com.von.kubernetesuser.board.model;
import com.von.kubernetesuser.article.model.Article;
import com.von.kubernetesuser.common.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name="boards")

public class Board extends BaseEntity {
    @Id
    @Column(name = "board_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "board_name")
    private String boardName;
    @Column(name = "board_type")
    private String boardType;

    @OneToMany(mappedBy = "boardId")
    private List<Article> articles;


    @Builder(builderMethodName = "builder")
    public Board(Long id, String boardName, String boardType, List<Article> articles) {
        this.id = id;
        this.boardName = boardName;
        this.boardType = boardType;
        this.articles = articles;

    }
}