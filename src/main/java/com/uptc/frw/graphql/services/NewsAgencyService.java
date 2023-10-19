package com.uptc.frw.graphql.services;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.NewsAgency;
import com.uptc.frw.graphql.jpa.repository.NewsAgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsAgencyService {
    @Autowired
    private NewsAgencyRepository newsAgencyRepository;
    public List<NewsAgency> getAllNewsAgency(){
        return newsAgencyRepository.findAll();
    }

    public NewsAgency getNewsAgencyById(Long id){
        return newsAgencyRepository.findById(id).get();
    }

    public NewsAgency createNewsAgency(String name , int year){
        NewsAgency newsAgency=new NewsAgency(name, year);
        return newsAgencyRepository.save(newsAgency);
    }

    public NewsAgency updateNameNewsAgency(Long id, String name){
        NewsAgency newsAgency=newsAgencyRepository.findById(id).get();
        newsAgency.setName(name);
        return newsAgencyRepository.save(newsAgency);
    }

    public String deleteNewsAgencyById(Long id){
        NewsAgency newsAgency=newsAgencyRepository.findById(id).get();
        newsAgencyRepository.delete(newsAgency);
        return "La agencia de noticias con id: "+id+" se ha eliminado";
    }
}
