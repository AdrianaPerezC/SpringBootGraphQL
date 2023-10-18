package com.uptc.frw.graphql.jpa.key;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.entity.PersonInvolved;

import java.io.Serializable;

public class JournalistInterviewPersonKey implements Serializable {
    private News news;
   // private PersonInvolved personInvolved;
    private Journalist journalist;

    public JournalistInterviewPersonKey() {
    }

    public JournalistInterviewPersonKey(News news,// PersonInvolved personInvolved,
                                        Journalist journalist) {
        this.news = news;
       // this.personInvolved = personInvolved;
        this.journalist = journalist;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    /*public PersonInvolved getPersonInvolved() {
        return personInvolved;
    }

    public void setPersonInvolved(PersonInvolved personInvolved) {
        this.personInvolved = personInvolved;
    }*/

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }
}
