package com.mustache.bbs.domain.entity;

import com.mustache.bbs.domain.ArticleResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "article")
public class ArticleEntity {
    @Id
    private Long id;
    private String title;
    private String content;

    public ArticleEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static ArticleResponse of(ArticleEntity articleEntity){
        return new ArticleResponse(articleEntity.getId(),
                articleEntity.getTitle(),
                articleEntity.getContent());
    }
}
