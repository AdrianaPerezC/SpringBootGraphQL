package com.uptc.frw.graphql.jpa.key;
import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.News;

import java.io.Serializable;

public class JournalistNewsKey implements Serializable {
    private Journalist journalist;
    private News news;

    public JournalistNewsKey() {
    }

    public JournalistNewsKey(Journalist journalist, News news) {
        this.journalist = journalist;
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
}
