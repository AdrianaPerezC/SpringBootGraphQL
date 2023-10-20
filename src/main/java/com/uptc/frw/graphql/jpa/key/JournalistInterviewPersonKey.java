package com.uptc.frw.graphql.jpa.key;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.entity.PersonInvolved;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class JournalistInterviewPersonKey implements Serializable {
    @Column(name = "CODIGO_PERIODISTA")
    private Long news;
    @Column(name = "CODIGO_IMPLICADO")
    private Long involved;
    @Column(name = "CODIGO_NOTICIA")
    private Long journalist;

    public JournalistInterviewPersonKey() {
    }

    public JournalistInterviewPersonKey(Long news, Long involved, Long journalist) {
        this.news = news;
        this.involved = involved;
        this.journalist = journalist;
    }

    public Long getNews() {
        return news;
    }

    public void setNews(Long news) {
        this.news = news;
    }

    public Long getInvolved() {
        return involved;
    }

    public void setInvolved(Long involved) {
        this.involved = involved;
    }

    public Long getJournalist() {
        return journalist;
    }

    public void setJournalist(Long journalist) {
        this.journalist = journalist;
    }
}
