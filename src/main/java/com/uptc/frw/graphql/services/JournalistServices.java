package com.uptc.frw.graphql.services;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.repository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalistServices {

    @Autowired
    private JournalistRepository journalistRepository;

    public List<Journalist> getAllJournalists() {
        return journalistRepository.findAll();
    }

    public Journalist getJournalistById(Long id) {
        return journalistRepository.findById(id).orElse(null);
    }

    public Journalist createJournalist(Journalist journalist){
        return journalistRepository.save(journalist);
    }

    public Journalist updateJournalist(Long id, String name){
        Journalist journalist = getJournalistById(id);
        journalist.setName(name);
        return journalistRepository.save(journalist);
    }

    public void deleteJournalist(Long id) {
        journalistRepository.deleteById(id);
    }

}
