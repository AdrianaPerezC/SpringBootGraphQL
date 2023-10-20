package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.*;
import com.uptc.frw.graphql.jpa.key.NewsAgencyNewsKey;
import com.uptc.frw.graphql.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.sql.Time;
import java.util.List;
@Controller
public class NewsAgencyNewsController {
    @Autowired
    private NewsAgencyService newsAgencyService;
    @Autowired
    private NewsService newsService;
    @Autowired
    private NewsAgencyNewsService newsAgencyNewsService;
    @QueryMapping
    public List<NewsAgencyNews> getAllNewsAgencyNews(){
        return  newsAgencyNewsService.getAllNewsAgencyNews();
    }
    @QueryMapping
    public NewsAgencyNews getNewsAgencyNewsById(@Argument int idJournalist, @Argument int idNew){
        return newsAgencyNewsService.getNewsAgencyNewsById(Long.valueOf(idJournalist),Long.valueOf(idNew));
    }
    @MutationMapping
    public NewsAgencyNews createNewsAgencyNews(@Argument int idnewsAgency,@Argument int idNew,@Argument String hour){
        NewsAgency newsAgency=newsAgencyService.getNewsAgencyById(Long.valueOf(idnewsAgency));
        News news=newsService.getNewsById(Long.valueOf(idNew));
        return newsAgencyNewsService.createNewsAgencyNews(news,newsAgency,hour);
    }
    @MutationMapping
    public String deleteNewsAgencyNews( @Argument int idJournalist,@Argument int idNew){
        return newsAgencyNewsService.deleteNewsAgencyNews(Long.valueOf(idJournalist),Long.valueOf(idNew));
    }

}
