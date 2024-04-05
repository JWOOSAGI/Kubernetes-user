package com.von.kubernetesuser.article.model;

import com.von.kubernetesuser.board.model.Board;
import com.von.kubernetesuser.common.model.BaseEntity;
import com.von.kubernetesuser.user.model.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString(exclude = {"id"})
@Entity(name = "articles")
public class Article extends BaseEntity {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // primary key
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board boardId;

    @Builder(builderMethodName = "builder")
    public Article(Long id, String title, String content, User userId, String registerDate,
                   Board boardId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.boardId = boardId;
    }
}
