package com.von.kubernetesuser.article.model;

import com.von.kubernetesuser.board.model.Board;
import com.von.kubernetesuser.common.model.BaseEntity;
import com.von.kubernetesuser.user.model.User;
import jakarta.persistence.*;
import jdk.security.jarsigner.JarSigner;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = {"id"})
@Entity(name = "articles")
@Builder
public class Article extends BaseEntity {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    //    private Long writer;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "writer")
    private User writer;

    public static Article of(Long id,String title,String content){
        Article article = new Article();
        article.id = id;
        article.title = title;
        article.content = content;

        return article;
    }
}
