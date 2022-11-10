package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.ArticleEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ArticleDto {
    private int id;
    private String title;
    private String content;

    public ArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ArticleEntity toEntity(){
        return new ArticleEntity(title, content);
    }
}
