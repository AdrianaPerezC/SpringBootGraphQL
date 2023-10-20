package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.PersonInvolved;
import com.uptc.frw.graphql.services.PersonInvolvedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.util.List;

@Controller
public class PersonInvolvedController {
    @Autowired
    private PersonInvolvedService personInvolvedService;
    @QueryMapping
    public List<PersonInvolved> getAllPersonInvolved(){
        return personInvolvedService.getAllPersonInvolved();
    }
    @QueryMapping
    public PersonInvolved getPersonInvolvedById(@Argument int id){
        return personInvolvedService.getPersonInvolvedById(Long.valueOf(id));
    }
    @MutationMapping
    public PersonInvolved createPersonInvolved(@Argument String name,@Argument String birthday,@Argument String qualityInvolved){
        return personInvolvedService.createPersonInvolved(name,birthday,qualityInvolved);
    }
    @MutationMapping
    public PersonInvolved updateNamePersonInvolved(@Argument int id,@Argument String name){
        return personInvolvedService.updateNamePersonInvolved(Long.valueOf(id),name);
    }
    @MutationMapping
    public String deletePersonInvolvedById(@Argument int id){
        return personInvolvedService.deletePersonInvolvedById(Long.valueOf(id));
    }


}
