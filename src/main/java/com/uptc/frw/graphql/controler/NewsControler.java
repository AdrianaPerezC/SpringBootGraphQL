package com.uptc.frw.graphql.controler;

import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsControler {
    @Autowired
    private NewsService newsService;
    @GetMapping
    public List<News> findAll(){
        return  newsService.findAllNews();
    }


}
