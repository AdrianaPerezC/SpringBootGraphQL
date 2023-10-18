package com.uptc.frw.graphql.services;

import com.uptc.frw.graphql.jpa.entity.JournalistNews;
import com.uptc.frw.graphql.jpa.repository.JournalistNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalistNewService {

    @Autowired
    private JournalistNewRepository journalistNewRepository;

    public List<JournalistNews> getAllJournalistNew(){
        return  journalistNewRepository.findAll();
    }

    public JournalistNews createJournalistNews(JournalistNews journalistNews){
        return journalistNewRepository.save(journalistNews);
    }

    public void deleteJournalistNews(Long idJournalist, Long idNews){
        //Consultar eliminar por los 2 parametrosjournalistNewRepository.deleteById();
    }


}
