package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.NewsAgency;
import com.uptc.frw.graphql.services.NewsAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Controller
public class NewsAgencyController {
    @Autowired
    private NewsAgencyService newsAgencyService;
    @QueryMapping
    public List<NewsAgency> getAllNewsAgency(){
        return newsAgencyService.getAllNewsAgency();
    }
    @QueryMapping
    public NewsAgency getNewsAgencyById(@Argument int id){
        return newsAgencyService.getNewsAgencyById(Long.valueOf(id));
    }
    @MutationMapping
    public NewsAgency createNewsAgency(@Argument String name ,@Argument int year){
        return newsAgencyService.createNewsAgency(name,year);
    }
    @MutationMapping
    public NewsAgency updateNameNewsAgency(@Argument int id, @Argument String name){
        return newsAgencyService.updateNameNewsAgency(Long.valueOf(id),name);
    }
    @MutationMapping
    public String deleteNewsAgencyById(int id){
        return newsAgencyService.deleteNewsAgencyById(Long.valueOf(id));
    }
}
