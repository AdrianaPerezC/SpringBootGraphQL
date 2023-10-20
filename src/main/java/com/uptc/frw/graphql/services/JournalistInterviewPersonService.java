package com.uptc.frw.graphql.services;
import com.uptc.frw.graphql.jpa.entity.*;
import com.uptc.frw.graphql.jpa.key.JournalistInterviewPersonKey;
import com.uptc.frw.graphql.jpa.repository.JournalistInterviewPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalistInterviewPersonService {

    @Autowired
    private JournalistInterviewPersonRepository journalistInterviewPersonRepository;

    public List<JournalistInterviewPerson> getAllJournalistInterviewPerson(){
        return  journalistInterviewPersonRepository.findAll();
    }

    public JournalistInterviewPerson getJournalistInterviewPersonById(Long idJournalist, Long idNews, Long idPersonInvolved){
        JournalistInterviewPersonKey journalistNewsKey=new JournalistInterviewPersonKey(idNews, idPersonInvolved,idJournalist);
        return journalistInterviewPersonRepository.findById(journalistNewsKey).get();
    }

    public JournalistInterviewPerson createJournalistInterviewPerson(Journalist journalist, News news, PersonInvolved personInvolved){
        JournalistInterviewPerson journalistInterviewPerson=new JournalistInterviewPerson(journalist,personInvolved,news);
        return journalistInterviewPersonRepository.save(journalistInterviewPerson);
    }

    public String deleteJournalistInterviewPerson(Long idJournalist, Long idNews, Long idPersonInvolved){
        JournalistInterviewPersonKey journalistInterviewPersonKey=new JournalistInterviewPersonKey(idNews, idPersonInvolved,idJournalist);
        journalistInterviewPersonRepository.deleteById(journalistInterviewPersonKey);
        return "Se ha eliminado la relación de la entrevista a la persona involucrada: "+idPersonInvolved+
                " con el periodista: "+idJournalist+ " de la noticia: "+idNews;
    }
}
