package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.repository.NewsRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Controller
public class NewsController {

    private NewsRepository newsRepository;

    public NewsController(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }
    @QueryMapping
    public List<News> getAllNews(){
        return newsRepository.findAll();
    }
    @QueryMapping
    public News getNewsById(@Argument("id") Long id) {
        return newsRepository.getReferenceById(id);
    }
    @MutationMapping
    public News createNews(@Argument Date dateNews, @Argument Time timeNews,@Argument String headLine,@Argument String text){
        News news = new News(dateNews, timeNews, headLine, text);
        return newsRepository.save(news);
    }


   /* @PutMapping("{/id}")
    public News updateNews(@PathVariable Long id, @RequestBody String headLine){
        return newService.updateNews(id, headLine);
    }
    @DeleteMapping("{/id}")
    public void deleteNews(@PathVariable Long id){
        newService.deleteNews(id);
    }*/
}
