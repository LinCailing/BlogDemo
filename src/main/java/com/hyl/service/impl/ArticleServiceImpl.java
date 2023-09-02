package com.hyl.service.impl;

import com.hyl.mapper.ArticleMapper;
import com.hyl.pojo.Article;
import com.hyl.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void add(Article article) {
        articleMapper.add(article);
    }

    @Override
    public List<Article> selectAll() {
        return articleMapper.selectAll();
    }

    @Override
    public Article selectByArticleId(Integer articleId) {
        return articleMapper.selectByArticleId(articleId);
    }
}
