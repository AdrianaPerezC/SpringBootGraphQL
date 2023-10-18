package com.uptc.frw.graphql.services;

import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public News createNews(News news){
        return newsRepository.save(news);
    }

    public News updateNewsHeadline(Long id, String headLine){
        News news = getNewsById(id);
        news.setHeadline(headLine);
        return newsRepository.save(news);
    }

    public String  deleteNews(Long id){
        newsRepository.deleteById(id);
        return "La noticia con Id: "+id+" ha sido eliminada";
    }
}
