package com.uptc.frw.graphql.jpa.entity;

import jdk.jfr.Enabled;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Year;
import java.util.List;

@Enabled
@Table(name = "AGENCIA_NOTICIAS")
public class NewsAgency {
 @Id
 @Column(name = "CODIGO_AGENCIA")
private Long  id;
@Column(name = "NOMBRE")
private String name;
@Column(name = "ANIO_CREACION")
private Year year;

@OneToMany(mappedBy = "newsAgency")
private List<NewsAgencyNews> newsAgencyNewsList;

    public NewsAgency() {
    }

    public NewsAgency(String name, Year year) {
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

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
    public List<NewsAgencyNews> getNewsAgencyNewsList() {
        return newsAgencyNewsList;
    }

    public void setNewsAgencyNewsList(List<NewsAgencyNews> newsAgencyNewsList) {
        this.newsAgencyNewsList = newsAgencyNewsList;
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
