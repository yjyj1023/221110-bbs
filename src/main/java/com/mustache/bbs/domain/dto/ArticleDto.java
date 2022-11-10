package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.ArticleEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public ArticleEntity toEntity(){
        return new ArticleEntity(title, content);
    }
}
