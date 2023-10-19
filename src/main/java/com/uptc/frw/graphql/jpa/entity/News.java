package com.uptc.frw.graphql.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name="NOTICIAS")
public class News {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_NOTICIA")
    private Long id;
    @Column(name = "FECHA")
    private Date dateNew;

    @Column(name = "HORA")
    private Time timeNew;

    @Column(name = "TITULAR")
    private String headline;

    @Column(name = "TEXTO")
    private String text;

    /*Se agrega la variable CODIGONOTICIAREFERENCIA
    que se mapea a la clave externa de la misma tabla News*/
    @OneToMany(mappedBy="newsReference")
    private List<News> newsList;

    @ManyToOne
    @JoinColumn(name="CODIGO_NOTICIA_REFERENCIA", referencedColumnName="CODIGO_NOTICIA")
    private News newsReference;

    @JsonIgnore
    @OneToMany(mappedBy = "news")
    private List<JournalistNews> journalistNews;
    @JsonIgnore
    @OneToMany(mappedBy = "news")
    private List<NewsAgencyNews> newsAgencyNewsList;

    @JsonIgnore
    @OneToMany(mappedBy = "news")
    private List<JournalistInterviewPerson> journalistInterviewPeople;

    public News() {
    }

    public News(Date dateNew, Time timeNew, String headline, String text) {
        this.dateNew = dateNew;
        this.timeNew = timeNew;
        this.headline = headline;
        this.text = text;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public News getNewsReference() {
        return newsReference;
    }

    public void setNewsReference(News newsReference) {
        this.newsReference = newsReference;
    }

    public List<JournalistInterviewPerson> getJournalistInterviewPeople() {
        return journalistInterviewPeople;
    }

    public void setJournalistInterviewPeople(List<JournalistInterviewPerson> journalistInterviewPeople) {
        this.journalistInterviewPeople = journalistInterviewPeople;
    }
    public List<NewsAgencyNews> getNewsAgencyNewsList() {
        return newsAgencyNewsList;
    }

    public void setNewsAgencyNewsList(List<NewsAgencyNews> newsAgencyNewsList) {
        this.newsAgencyNewsList = newsAgencyNewsList;
    }
    public List<JournalistNews> getJournalistNews() {
        return journalistNews;
    }

    public void setJournalistNews(List<JournalistNews> journalistNews) {
        this.journalistNews = journalistNews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateNew() {
        return dateNew;
    }

    public void setDateNew(Date dateNew) {
        this.dateNew = dateNew;
    }

    public Time getTimeNew() {
        return timeNew;
    }

    public void setTimeNew(Time timeNew) {
        this.timeNew = timeNew;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "News{" +
                "idNew=" + id +
                ", dateNew=" + dateNew +
                ", timeNew=" + timeNew +
                ", headline='" + headline + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

