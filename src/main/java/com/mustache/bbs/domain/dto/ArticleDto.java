package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.ArticleEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleEntity toEntity(){
        return new ArticleEntity(title, content);
    }
}
