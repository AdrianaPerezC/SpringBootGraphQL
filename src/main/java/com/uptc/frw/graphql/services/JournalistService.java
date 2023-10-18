package com.uptc.frw.graphql.services;
import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.repository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JournalistService {
    @Autowired
    private JournalistRepository journalistRepository;

    public List<Journalist> getAllJournalists(){
        return journalistRepository.findAll();
    }

    public Journalist getJournalistById(Long id){
        return journalistRepository.findById(id).get();
    }

    public Journalist addJournalist(String name ,String address , String phone , int numberNews){
        Journalist journalist=new Journalist(name, address, phone, numberNews);
        return journalistRepository.save(journalist);
    }

    public Journalist updateNameJournalistById(int id, String name){
        Journalist journalist=journalistRepository.findById(Long.valueOf(id)).get();
        journalist.setName(name);
        return journalistRepository.save(journalist);
    }

    public String deleteJournalistById(int id){
        Journalist journalist=journalistRepository.findById(Long.valueOf(id)).get();
        journalistRepository.delete(journalist);
        return "Periodista con id: "+id+" se ha eliminado";
    }
}
