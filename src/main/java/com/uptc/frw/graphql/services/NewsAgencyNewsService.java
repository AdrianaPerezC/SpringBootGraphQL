package com.uptc.frw.graphql.services;

import com.uptc.frw.graphql.jpa.entity.*;
import com.uptc.frw.graphql.jpa.key.JournalistNewsKey;
import com.uptc.frw.graphql.jpa.key.NewsAgencyNewsKey;
import com.uptc.frw.graphql.jpa.repository.JournalistNewsRepository;
import com.uptc.frw.graphql.jpa.repository.NewsAgencyNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;

@Service
public class NewsAgencyNewsService {

    @Autowired
    private NewsAgencyNewsRepository newsAgencyNewsRepository;

    public List<NewsAgencyNews> getAllNewsAgencyNews(){
        return  newsAgencyNewsRepository.findAll();
    }

    public NewsAgencyNews getNewsAgencyNewsById(Long news, Long newsAgency){
        NewsAgencyNewsKey newsAgencyNewsKey=new NewsAgencyNewsKey(newsAgency,news);
        return newsAgencyNewsRepository.findById(newsAgencyNewsKey).get();
    }

    public NewsAgencyNews createNewsAgencyNews(News news, NewsAgency newsAgency, String hour){
        NewsAgencyNews newsAgencyNews=new NewsAgencyNews( Time.valueOf(hour));
        newsAgencyNews.setNewsAgency(newsAgency);
        newsAgencyNews.setNews(news);
        return newsAgencyNewsRepository.save(newsAgencyNews);
    }

    public String deleteNewsAgencyNews(Long news, Long newsAgency){
        NewsAgencyNewsKey newsAgencyNewsKey=new NewsAgencyNewsKey(newsAgency,news);
        newsAgencyNewsRepository.deleteById(newsAgencyNewsKey);
        return "Se ha eliminado la relación de la noticia con id: "+news+" con la agencia de Noticias: "+newsAgency;
    }
}
