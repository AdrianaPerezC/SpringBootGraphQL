package com.uptc.frw.graphql.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uptc.frw.graphql.jpa.key.NewsAgencyNewsKey;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Entity
@Table(name = "NOTICIA_AGENCIA_NOTICIAS")
public class NewsAgencyNews {
    @EmbeddedId
    private NewsAgencyNewsKey newsAgencyNewsKey;
    @Column(name = "HORA")
    private Time hour;
    @ManyToOne
    @JoinColumn(name = "CODIGO_AGENCIA_NOTICIAS",insertable = false,updatable = false)
    private NewsAgency newsAgency;
    @ManyToOne
    @JoinColumn(name = "CODIGO_NOTICIA",insertable = false,updatable = false)
    private News news;

    public NewsAgencyNews() {
    }

    public NewsAgencyNews(Time hour, NewsAgency newsAgency, News news) {
        this.hour = hour;
        this.newsAgency = newsAgency;
        this.news = news;
    }

    public NewsAgencyNews(Time hour) {
        this.hour = hour;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public NewsAgency getNewsAgency() {
        return newsAgency;
    }

    public void setNewsAgency(NewsAgency newsAgency) {
        this.newsAgency = newsAgency;
    }

    @Override
    public String toString() {
        return "NewsAgencyNews{" +
                "news=" + news +
                ", newsAgency=" + newsAgency +
                ", hour=" + hour +
                '}';
    }
}
