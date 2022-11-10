package com.mustache.bbs.domain.entity;

import lombok.Getter;

import javax.persistence.Entity;

@Entity
@Getter
public class ArticleEntity {
    private int id;
    private String title;
    private String content;

    public ArticleEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
