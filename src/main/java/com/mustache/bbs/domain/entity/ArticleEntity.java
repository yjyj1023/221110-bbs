package com.mustache.bbs.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class ArticleEntity {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String content;

    public ArticleEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
