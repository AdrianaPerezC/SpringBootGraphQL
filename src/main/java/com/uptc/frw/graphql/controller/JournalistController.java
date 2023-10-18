package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.services.JournalistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class JournalistController {
    @Autowired
    private JournalistService journalistService;
    @QueryMapping
    public List<Journalist> allJournalists(){
        return journalistService.getAllJournalists();
    }
    @QueryMapping
    public Journalist getJournalistById(@Argument("id") int id){
        return journalistService.getJournalistById(Long.valueOf(id));
    }

    @MutationMapping
    public Journalist addJournalist(@Argument String name , @Argument String address , @Argument String phone , @Argument int numberNews){
        return journalistService.addJournalist(name, address, phone, numberNews);
    }

    @MutationMapping
    public Journalist updateNameJournalistById(@Argument("id") int id, @Argument String name){
        return journalistService.updateNameJournalistById(id,name);
    }

    @MutationMapping
    public String deleteJournalistById(@Argument("id") int id){
        return journalistService.deleteJournalistById(id);
    }
}
