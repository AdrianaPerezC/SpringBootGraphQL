package com.uptc.frw.graphql.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uptc.frw.graphql.jpa.key.JournalistInterviewPersonKey;

import javax.persistence.*;

@Entity
@Table(name = "PERIODISTAS_ENTREVISTA_PERSONA_IMPLICADA")
@IdClass(JournalistInterviewPersonKey.class)
public class JournalistInterviewPerson {
    @Id
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="CODIGO_PERIODISTA",nullable = false)
    private Journalist journalist;
    @Id
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="CODIGO_IMPLICADO",nullable = false)
    private PersonInvolved involved;
    @Id
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="CODIGO_NOTICIA",nullable = false)
    private News news;

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

    @Override
    public String toString() {
        return "JournalistInterviewPerson{" +
                "codigo_periodista=" + journalist +
                ", codigo_implicado=" +  involved+
                ", codigo_noticia=" + news +
                '}';
    }
}
