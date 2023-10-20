package com.uptc.frw.graphql.jpa.entity;
import com.uptc.frw.graphql.jpa.key.JournalistNewsKey;

import javax.persistence.*;

@Entity
@Table(name = "PERIODISTAS_CUBREN_NOTICIAS")
public class JournalistNews {
    @EmbeddedId
    private  JournalistNewsKey journalistNewsKey;
    @ManyToOne
    @JoinColumn(name = "CODIGO_PERIODISTA",insertable = false,updatable = false)
    private Journalist journalist;
    @ManyToOne
    @JoinColumn(name = "CODIGO_NOTICIA",insertable = false,updatable = false)
    private News news;

    public JournalistNews() {
    }

    public JournalistNews(JournalistNewsKey journalistNewsKey) {
        this.journalistNewsKey = journalistNewsKey;
    }

    public JournalistNewsKey getJournalistNewsKey() {
        return journalistNewsKey;
    }

    public void setJournalistNewsKey(JournalistNewsKey journalistNewsKey) {
        this.journalistNewsKey = journalistNewsKey;
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
