package com.uptc.frw.graphql.services;

import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews(){
        return  newsRepository.findAll();
    }

    public News getNewsById(Long id){
        return newsRepository.findById(id).orElse(null);
    }

    public News createNews(String dateNew, String timeNew, String headline, String text){
        News news=new News(Date.valueOf(dateNew), Time.valueOf(timeNew),headline,text);
        return newsRepository.save(news);
    }

    public News updateNewsHeadline(Long id, String headLine){
        News news = getNewsById(id);
        news.setHeadline(headLine);
        return newsRepository.save(news);
    }

    public News addNewsReferences(Long id, Long idNewReference){
        News news = getNewsById(id);
        News newsReference=getNewsById(idNewReference);
        newsReference.getNewsList().add(news);
        news.setNewsReference(newsReference);
        newsRepository.save(newsReference);
        return newsRepository.save(news);
    }

    public String  deleteNews(Long id){
        newsRepository.deleteById(id);
        return "La noticia con Id: "+id+" ha sido eliminada";
    }

}
