package com.uptc.frw.graphql.services;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.JournalistNews;
import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.key.JournalistNewsKey;
import com.uptc.frw.graphql.jpa.repository.JournalistNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalistNewsService {

    @Autowired
    private JournalistNewsRepository journalistNewRepository;

    public List<JournalistNews> getAllJournalistNew(){
        return  journalistNewRepository.findAll();
    }

    public JournalistNews getJournalistNewsById(Journalist journalist, News news){
        JournalistNewsKey journalistNewsKey=new JournalistNewsKey(journalist.getId(), news.getId());
        return journalistNewRepository.findById(journalistNewsKey).get();
    }

    public JournalistNews createJournalistNews(Journalist journalist, News news){
        JournalistNewsKey journalistNewsKey=new JournalistNewsKey(journalist.getId(), news.getId());
        JournalistNews journalistNews=new JournalistNews(journalistNewsKey);
        journalistNews.setJournalist(journalist);
        journalistNews.setNews(news);
        return journalistNewRepository.save(journalistNews);
    }

    public String deleteJournalistNews(Journalist journalist, News news){
        JournalistNewsKey journalistNewsKey=new JournalistNewsKey(journalist.getId(), news.getId());
        journalistNewRepository.deleteById(journalistNewsKey);
        return "Se ha eliminado la relación de la noticia con id: "+news.getId()+" que cubrió el periodista: "+journalist.getId();
    }
}
