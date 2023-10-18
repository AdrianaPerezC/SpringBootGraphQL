package com.uptc.frw.graphql.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERIODISTAS_CUBREN_NOTICIAS")
public class JournalistNews {
    @Id
    @ManyToOne
    @JoinColumn(name = "CODIGOPERIODISTA")
    private Journalist idJournalist;

    @Id
    @ManyToOne
    @JoinColumn(name = "CODIGONOTICIA")
    private News idNew;

    public JournalistNews() {
    }

    public JournalistNews(Journalist idJournalist, News idNew) {
        this.idJournalist = idJournalist;
        this.idNew = idNew;
    }

    public Journalist getIdJournalist() {
        return idJournalist;
    }

    public void setIdJournalist(Journalist idJournalis) {
        this.idJournalist = idJournalis;
    }

    public News getIdNew() {
        return idNew;
    }

    public void setIdNew(News idNew) {
        this.idNew = idNew;
    }

    @Override
    public String toString() {
        return "JournalistNews{" +
                "idJournalis=" + idJournalist +
                ", idNew=" + idNew +
                '}';
    }
}
