package com.uptc.frw.graphql.controlller;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.repository.JournalistRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class JournalistController {
 private JournalistRepository journalistRepository;

    public JournalistController(JournalistRepository journalistRepository) {
        this.journalistRepository = journalistRepository;
    }

    @QueryMapping
    public List<Journalist> allJournalists(){
        return journalistRepository.findAll();
    }
    @QueryMapping
    public Journalist getJournalistById(@Argument("id") int id){
        return journalistRepository.findById(Long.valueOf(id)).get();
    }

    @MutationMapping
    public Journalist addJournalist(@Argument String name ,@Argument String address ,@Argument String phone ,@Argument int numNews){
        Journalist journalist=new Journalist(name, address, phone, numNews);
        return journalistRepository.save(journalist);
    }
}
