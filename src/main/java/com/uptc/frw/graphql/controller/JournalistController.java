package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.services.JournalistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journalist")
public class JournalistController {
    @Autowired
    private JournalistServices journalistServices;
    @GetMapping
    public List<Journalist> getAllJournalists(){
        return journalistServices.getAllJournalists();
    }

    //@PathVariable ayuda a extraer valores de variables de una url /"id"
    @GetMapping("/{id}")
    public Journalist getJournalistById(@PathVariable Long id){
        return journalistServices.getJournalistById(id);
    }
    //@RequestBody para vincular el parametro a los datos del cuerpo de la solicitud HTTP
    @PostMapping
    public Journalist createJournalist(@RequestBody Journalist journalist){
        return journalistServices.createJournalist(journalist);
    }
    //actualizamos el nombre del periodista
    @PutMapping("/{id}")
    public Journalist updateJournalist(@PathVariable Long id, @RequestParam String name){
            return journalistServices.updateJournalist(id, name);
    }

    @DeleteMapping("/{id}")
    public void deleteJournalist(@PathVariable Long id){
        journalistServices.deleteJournalist(id);
    }
}
