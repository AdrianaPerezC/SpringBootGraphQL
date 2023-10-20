package com.uptc.frw.graphql.services;
import com.uptc.frw.graphql.jpa.entity.PersonInvolved;
import com.uptc.frw.graphql.jpa.repository.PersonInvolvedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.util.List;

@Service
public class PersonInvolvedService {
    @Autowired
    private PersonInvolvedRepository personInvolvedRepository;

    public List<PersonInvolved> getAllPersonInvolved(){
        return personInvolvedRepository.findAll();
    }

    public PersonInvolved getPersonInvolvedById(Long id){
        return personInvolvedRepository.findById(id).get();
    }

    public PersonInvolved createPersonInvolved(String name, String birthday, String qualityInvolved){
        PersonInvolved personInvolved=new PersonInvolved(name,Date.valueOf(birthday),qualityInvolved);
        return personInvolvedRepository.save(personInvolved);
    }

    public PersonInvolved updateNamePersonInvolved(Long id, String name){
        PersonInvolved personInvolved=personInvolvedRepository.findById(id).get();
        personInvolved.setName(name);
        return personInvolvedRepository.save(personInvolved);
    }

    public String deletePersonInvolvedById(Long id){
        PersonInvolved personInvolved=personInvolvedRepository.findById(id).get();
        personInvolvedRepository.delete(personInvolved);
        return "La persona involucrada con id: "+id+" se ha eliminado";
    }


}
