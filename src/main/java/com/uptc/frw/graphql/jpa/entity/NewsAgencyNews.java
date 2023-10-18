package com.uptc.frw.graphql.jpa.entity;

import com.uptc.frw.graphql.jpa.key.NewsAgencyNewsKey;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "NOTICIA_AGENCIA_NOTICIAS")
@IdClass(NewsAgencyNewsKey.class)
public class NewsAgencyNews {
    @Id
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="CODIGO_NOTICIA", nullable = false)
    private News news;
    @Id
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="CODIGO_AGENCIA_NOTICIAS",nullable = false)
    private NewsAgency newsAgency;
    @Column(name = "HORA")
    private Date hour;

    public NewsAgencyNews() {
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
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
