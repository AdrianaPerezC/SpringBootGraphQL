package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.repository.NewsRepository;
import com.uptc.frw.graphql.services.JournalistService;
import com.uptc.frw.graphql.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

//@Controller
public class NewsController {
  /*  @Autowired
    private NewsService newsService;
    @QueryMapping
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }
    @QueryMapping
    public News getNewsById(@Argument("id") int id){
        return newsService.getNewsById(Long.valueOf(id));
    }

    @MutationMapping
    public News addJournalist(@Argument News news) {
        return newsService.createNews(news);
    }

    @MutationMapping
    public News updateNewsHeadline(@Argument("id") int id, @Argument String headLine){
        return newsService.updateNewsHeadline(Long.valueOf(id),headLine);
    }

    @MutationMapping
    public String deleteJournalistById(@Argument("id") int id){
        return newsService.deleteNews(Long.valueOf(id));
    }*/

}
