package com.mustache.bbs.controller;


import com.mustache.bbs.domain.dto.ArticleDto;
import com.mustache.bbs.domain.entity.ArticleEntity;
import com.mustache.bbs.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("")
    public String index(){
        return "redirect:/articles/list";
    }

    @GetMapping(value = "/new")
    public String newArticleFrom(){
        return "/new";
    }

    @PostMapping(value = "/posts")
    public String createArticle(ArticleDto form){
        log.info(form.toString());
        ArticleEntity articleEntity = form.toEntity();
        articleRepository.save(articleEntity);
        return String.format("redirect:/articles/%d", articleEntity.getId());
    }

    @GetMapping(value = "/{id}")
    public String selectSingle(@PathVariable Long id, Model model){
        Optional<ArticleEntity> optArticle = articleRepository.findById(id);
        if(!optArticle.isEmpty()){
            model.addAttribute("article", optArticle.get());
            return "show";
        }else{
            return "error";
        }
    }

    @GetMapping(value = "/list")
    public String list(Model model){
        List<ArticleEntity> articleEntityList = articleRepository.findAll();
        model.addAttribute("articles", articleEntityList);
        return "list";
    }
}
