package com.uptc.frw.graphql.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERIODISTAS_CUBREN_NOTICIAS")
public class JournalistNews {
    @Id
    @ManyToOne
    @JoinColumn(name = "CODIGO_PERIODISTA",nullable = false)
    private Journalist journalist;

    @Id
    @ManyToOne
    @JoinColumn(name = "CODIGO_NOTICIA",nullable = false)
    private News news;

    public JournalistNews() {
    }

    public JournalistNews(Journalist idJournalist, News news) {
        this.journalist = idJournalist;
        this.news = news;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "JournalistNews{" +
                "idJournalis=" + journalist +
                ", idNew=" + news +
                '}';
    }
}
