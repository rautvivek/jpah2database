package com.example.demo.dao;


import com.example.demo.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IArticleDAO extends JpaRepository<Article,Integer> {

}
 