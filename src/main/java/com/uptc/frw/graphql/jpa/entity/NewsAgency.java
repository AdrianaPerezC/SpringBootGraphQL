package com.uptc.frw.graphql.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AGENCIA_NOTICIAS")
public class NewsAgency {
    @Id
    @Column(name = "CODIGO_AGENCIA")
    private Long  id;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "ANIO_CREACION")
    private int year;
    @JsonIgnore
    @OneToMany(mappedBy = "newsAgency")
    private List<NewsAgencyNews> newsAgencyNewsList;

    public NewsAgency() {
    }

    public NewsAgency(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "NewsAgency{" +
                "agencia_noticia=" + id +
                ", nombre='" + name + '\'' +
                ", ano_creacion=" + year +
                '}';
    }
}
