package com.uptc.frw.graphql.jpa.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name="PERIODISTAS")
public class Journalist {
    @Id
    @Column(name="CODIGO_PERIODISTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="NOMBRE")
    private String name;
    @Column(name="DIRECCION")
    private String address;
    @Column(name="TELEFONO")
    private String phone;
    @Column(name="NUMERO_NOTICIAS")
    private int numberNews;
    @OneToMany(mappedBy = "journalist")
    private List<JournalistNews> journalistNews;

    @OneToMany(mappedBy = "journalist")
    private List<JournalistInterviewPerson> journalistInterviewPeople;

    public Journalist() {
    }

    public Journalist(String name, String address, String phone, int numberNews) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numberNews = numberNews;
    }

    public List<JournalistNews> getJournalistNews() {
        return journalistNews;
    }

    public void setJournalistNews(List<JournalistNews> journalistNews) {
        this.journalistNews = journalistNews;
    }

    public List<JournalistInterviewPerson> getJournalistInterviewPeople() {
        return journalistInterviewPeople;
    }

    public void setJournalistInterviewPeople(List<JournalistInterviewPerson> journalistInterviewPeople) {
        this.journalistInterviewPeople = journalistInterviewPeople;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberNews() {
        return numberNews;
    }

    public void setNumberNews(int numberNews) {
        this.numberNews = numberNews;
    }

    @Override
    public String toString() {
        return "Journalist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", numberNews=" + numberNews +
                '}';
    }

}
