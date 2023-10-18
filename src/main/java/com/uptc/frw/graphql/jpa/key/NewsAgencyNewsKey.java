package com.uptc.frw.graphql.jpa.key;

import com.uptc.frw.graphql.jpa.entity.NewsAgency;
import com.uptc.frw.graphql.jpa.entity.News;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class NewsAgencyNewsKey implements Serializable {
    private NewsAgency newsAgency;
    private News news;

    public NewsAgencyNewsKey() {
    }

    public NewsAgencyNewsKey(NewsAgency newsAgency, News news) {
        this.newsAgency = newsAgency;
        this.news = news;
    }

    public NewsAgency getNewsAgency() {
        return newsAgency;
    }

    public void setNewsAgency(NewsAgency newsAgency) {
        this.newsAgency = newsAgency;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "NewsAgencyNewsKey{" +
                "newsAgency=" + newsAgency +
                ", news=" + news +
                '}';
    }
}
