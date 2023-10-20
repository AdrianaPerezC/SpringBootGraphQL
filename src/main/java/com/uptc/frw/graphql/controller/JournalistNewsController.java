package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.JournalistNews;
import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.key.JournalistNewsKey;
import com.uptc.frw.graphql.services.JournalistNewsService;
import com.uptc.frw.graphql.services.JournalistService;
import com.uptc.frw.graphql.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JournalistNewsController {
    @Autowired
    private JournalistNewsService journalistNewsService;
    @Autowired
    private JournalistService journalistService;
    @Autowired
    private NewsService newsService;
    @QueryMapping
    public List<JournalistNews> getAllJournalistNew(){
        return  journalistNewsService.getAllJournalistNew();
    }
    @QueryMapping
    public JournalistNews getJournalistNewsById(@Argument int idJournalist,@Argument int idNew){
        Journalist journalist=journalistService.getJournalistById(Long.valueOf(idJournalist));
        News news=newsService.getNewsById(Long.valueOf(idNew));
        return journalistNewsService.getJournalistNewsById(journalist,news);
    }
    @MutationMapping
    public JournalistNews createJournalistNews(@Argument int idJournalist,@Argument int idNew){
        Journalist journalist=journalistService.getJournalistById(Long.valueOf(idJournalist));
        News news=newsService.getNewsById(Long.valueOf(idNew));
        return journalistNewsService.createJournalistNews(journalist, news);
    }
    @MutationMapping
    public String deleteJournalistNews( @Argument int idJournalist,@Argument int idNew){
        Journalist journalist=journalistService.getJournalistById(Long.valueOf(idJournalist));
        News news=newsService.getNewsById(Long.valueOf(idNew));
        return journalistNewsService.deleteJournalistNews(journalist,news);
    }
}
