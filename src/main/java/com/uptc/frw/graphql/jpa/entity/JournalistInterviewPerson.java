package com.uptc.frw.graphql.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uptc.frw.graphql.jpa.key.JournalistInterviewPersonKey;

import javax.persistence.*;

@Entity
@Table(name = "PERIODISTAS_ENTREVISTA_PERSONA_IMPLICADA")
public class JournalistInterviewPerson {
    @EmbeddedId
    private  JournalistInterviewPersonKey journalistInterviewPersonKey;
    @ManyToOne
    @JoinColumn(name = "CODIGO_PERIODISTA",insertable = false,updatable = false)
    private Journalist journalist;
    @ManyToOne
    @JoinColumn(name = "CODIGO_IMPLICADO",insertable = false,updatable = false)
    private PersonInvolved involved;
    @ManyToOne
    @JoinColumn(name = "CODIGO_NOTICIA",insertable = false,updatable = false)
    private News news;

    public JournalistInterviewPerson(JournalistInterviewPersonKey journalistInterviewPersonKey) {
        this.journalistInterviewPersonKey = journalistInterviewPersonKey;
    }

    public JournalistInterviewPerson() {
    }

    public JournalistInterviewPerson(Journalist journalist, PersonInvolved involved, News news) {
        this.journalist = journalist;
        this.involved = involved;
        this.news = news;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public PersonInvolved getInvolved() {
        return involved;
    }

    public void setInvolved(PersonInvolved involved) {
        this.involved = involved;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public JournalistInterviewPersonKey getJournalistInterviewPersonKey() {
        return journalistInterviewPersonKey;
    }

    public void setJournalistInterviewPersonKey(JournalistInterviewPersonKey journalistInterviewPersonKey) {
        this.journalistInterviewPersonKey = journalistInterviewPersonKey;
    }

    @Override
    public String toString() {
        return "JournalistInterviewPerson{" +
                "codigo_periodista=" + journalist +
                ", codigo_implicado=" +  involved+
                ", codigo_noticia=" + news +
                '}';
    }
}
