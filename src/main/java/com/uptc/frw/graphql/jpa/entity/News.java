package com.uptc.frw.graphql.jpa.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name="NOTICIAS")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGONOTICIA")
    private Long idNew;
    @Column(name = "FECHA")
    private Date dateNew;

    @Column(name = "HORA")
    private Time timeNew;

    @Column(name = "TITULAR")
    private String headline;

    @Column(name = "TEXTO")
    private String text;

    /*Se agrega la variable CODIGONOTICIAREFERENCIA
    que se mapea a la clave externa de la misma tabla News*/
    @ManyToMany
    @JoinColumn(name = "CODIGONOTICIAREFERENCIA")
    private List<News> codNewReference;

    @ManyToMany
    @JoinTable(
            name = "PERIODISTAS_CUBREN_NOTICIAS",
            joinColumns = @JoinColumn(name = "codigoNoticia"),
            inverseJoinColumns = @JoinColumn(name = "codigoPeriodista")
    )
    private List<Journalist> journalistList;

    public News() {
    }

    public News(Date dateNew, Time timeNew, String headline, String text) {
        this.dateNew = dateNew;
        this.timeNew = timeNew;
        this.headline = headline;
        this.text = text;
    }

    public Long getIdNew() {
        return idNew;
    }

    public void setIdNew(Long idNew) {
        this.idNew = idNew;
    }

    public Date getDateNew() {
        return dateNew;
    }

    public void setDateNew(Date dateNew) {
        this.dateNew = dateNew;
    }

    public Time getTimeNew() {
        return timeNew;
    }

    public void setTimeNew(Time timeNew) {
        this.timeNew = timeNew;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "News{" +
                "idNew=" + idNew +
                ", dateNew=" + dateNew +
                ", timeNew=" + timeNew +
                ", headline='" + headline + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

