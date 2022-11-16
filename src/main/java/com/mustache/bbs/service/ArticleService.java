package com.mustache.bbs.service;

import com.mustache.bbs.domain.ArticleResponse;
import com.mustache.bbs.domain.dto.ArticleDto;
import com.mustache.bbs.domain.entity.ArticleEntity;
import com.mustache.bbs.repository.ArticleRepository;

import java.util.Optional;

public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public ArticleResponse getArticle(Long id){
        Optional<ArticleEntity> optArticle = articleRepository.findById(id);
        ArticleEntity article = optArticle.get();
        ArticleResponse articleResponse = article.of(optArticle.get());
        return articleResponse;
    }
}
