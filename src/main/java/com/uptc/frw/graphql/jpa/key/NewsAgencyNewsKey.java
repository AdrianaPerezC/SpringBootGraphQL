package com.uptc.frw.graphql.jpa.key;

import com.uptc.frw.graphql.jpa.entity.NewsAgency;
import com.uptc.frw.graphql.jpa.entity.News;

import javax.persistence.*;
import java.io.Serializable;
@Embeddable
public class NewsAgencyNewsKey implements Serializable {
    @Column(name = "CODIGO_AGENCIA_NOTICIAS")
    private Long newsAgency;
    @Column(name = "CODIGO_NOTICIA")
    private Long news;

    public NewsAgencyNewsKey() {
    }

    public NewsAgencyNewsKey(Long newsAgency, Long news) {
        this.newsAgency = newsAgency;
        this.news = news;
    }

    public Long getNewsAgency() {
        return newsAgency;
    }

    public void setNewsAgency(Long newsAgency) {
        this.newsAgency = newsAgency;
    }

    public Long getNews() {
        return news;
    }

    public void setNews(Long news) {
        this.news = news;
    }
}
