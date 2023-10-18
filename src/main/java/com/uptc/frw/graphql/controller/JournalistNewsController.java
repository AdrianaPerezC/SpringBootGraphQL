package com.uptc.frw.graphql.controller;

import com.uptc.frw.graphql.jpa.entity.JournalistNews;
import com.uptc.frw.graphql.services.JournalistNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
public class JournalistNewsController {
  /*  @Autowired
    private JournalistNewsService journalistNewService;

    @GetMapping
    public List<JournalistNews> getAllJournalistNews() {
        return journalistNewService.getAllJournalistNew();
    }

    @PostMapping
    public JournalistNews createJournalistNews(@RequestBody JournalistNews journalistNews) {
        return journalistNewService.createJournalistNews(journalistNews);
    }

    @DeleteMapping("/{idPeriodista}/{idNoticias}")
    public void deletePeriodistasCubrenNoticias(
            @PathVariable Long idPeriodista,
            @PathVariable Long idNoticias) {
        journalistNewService.deleteJournalistNews(idPeriodista, idNoticias);
}
*/

}
