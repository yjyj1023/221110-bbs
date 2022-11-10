package com.mustache.bbs.domain.dto;

import lombok.Getter;

@Getter
public class ArticleDto {
    private int id;
    private String title;
    private String content;

    public ArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
