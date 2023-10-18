package com.uptc.frw.graphql.jpa.key;

import com.uptc.frw.graphql.jpa.entity.Journalist;
import com.uptc.frw.graphql.jpa.entity.News;
import com.uptc.frw.graphql.jpa.entity.PersonInvolved;

import java.io.Serializable;

public class JournalistInterviewPersonKey implements Serializable {
    private News news;
    private PersonInvolved involved;
    private Journalist journalist;

    public JournalistInterviewPersonKey() {
    }

    public JournalistInterviewPersonKey(News news, PersonInvolved involved,Journalist journalist) {
        this.news = news;
        this.involved = involved;
        this.journalist = journalist;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public PersonInvolved getInvolved() {
        return involved;
    }

    public void setInvolved(PersonInvolved involved) {
        this.involved = involved;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }
}
