package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.JournalistInterviewPerson;
import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.entity.PersonInvolved;
import com.uptc.frw.graphql.jpa.key.JournalistInterviewPersonKey;
import com.uptc.frw.graphql.services.JournalistInterviewPersonService;
import com.uptc.frw.graphql.services.JournalistService;
import com.uptc.frw.graphql.services.NewsService;
import com.uptc.frw.graphql.services.PersonInvolvedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class JournalistInterviewPersonController {
    @Autowired
    private JournalistInterviewPersonService journalistInterviewPersonService;
    @Autowired
    private JournalistService journalistService;
    @Autowired
    private NewsService newsService;
    @Autowired
    private PersonInvolvedService personInvolvedService;
    @QueryMapping
    public List<JournalistInterviewPerson> getAllJournalistInterviewPerson(){
        return  journalistInterviewPersonService.getAllJournalistInterviewPerson();
    }
    @QueryMapping
    public JournalistInterviewPerson getJournalistInterviewPersonById(@Argument int journalist, @Argument int news, @Argument int personInvolved){
        return journalistInterviewPersonService.getJournalistInterviewPersonById(Long.valueOf(journalist),Long.valueOf(news),Long.valueOf(personInvolved));
    }
    @MutationMapping
    public JournalistInterviewPerson createJournalistInterviewPerson(@Argument int idJournalist, @Argument int idNew, @Argument int idInvolved){
        Journalist journalist=journalistService.getJournalistById(Long.valueOf(idJournalist));
        News news=newsService.getNewsById(Long.valueOf(idNew));
        PersonInvolved personInvolved=personInvolvedService.getPersonInvolvedById(Long.valueOf(idInvolved));
        return journalistInterviewPersonService.createJournalistInterviewPerson(journalist,news,personInvolved);
    }
    @MutationMapping
    public String deleteJournalistInterviewPerson(@Argument int idJournalist, @Argument int idNew, @Argument int idInvolved){
        return journalistInterviewPersonService.deleteJournalistInterviewPerson(Long.valueOf(idJournalist), Long.valueOf(idNew), Long.valueOf(idInvolved));
    }
}
