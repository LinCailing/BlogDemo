package com.hyl.service;


import com.hyl.pojo.Article;

import java.util.List;

public interface ArticleService {
    void add(Article article);

    List<Article> selectAll();

    Article selectByArticleId(Integer articleId);
}
