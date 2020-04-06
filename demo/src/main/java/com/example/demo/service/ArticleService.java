package com.example.demo.service;

import com.example.demo.dao.IArticleDAO;
import com.example.demo.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {
	@Autowired
	private IArticleDAO articleDAO;
	@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.findById(articleId).get();
		return obj;
	}	
	@Override
	public List<Article> getAllArticles(){
		return articleDAO.findAll();
	}
	@Override
	public  boolean addArticle(Article article){

    	   articleDAO.save(article);
    	   return true;

	}
	@Override
	public void updateArticle(Article article) {
		articleDAO.save(article);
	}
	@Override
	public void deleteArticle(int articleId) {
		articleDAO.deleteById(articleId);
	}
}
