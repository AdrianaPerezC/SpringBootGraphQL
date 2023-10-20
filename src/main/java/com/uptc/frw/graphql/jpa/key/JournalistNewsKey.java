package com.uptc.frw.graphql.jpa.key;
import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.News;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Embeddable
public class JournalistNewsKey implements Serializable {
    @Column(name = "CODIGO_PERIODISTA")
    private Long journalist;
    @Column(name = "CODIGO_NOTICIA")
    private Long news;

    public JournalistNewsKey() {
    }

    public JournalistNewsKey(Long journalist, Long news) {
        this.journalist = journalist;
        this.news = news;
    }

    public Long getJournalist() {
        return journalist;
    }

    public void setJournalist(Long journalist) {
        this.journalist = journalist;
    }

    public Long getNews() {
        return news;
    }

    public void setNews(Long news) {
        this.news = news;
    }
}
