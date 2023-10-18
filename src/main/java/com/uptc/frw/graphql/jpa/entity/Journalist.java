package com.uptc.frw.graphql.jpa.entity;

import javax.persistence.*;

import java.util.List;


@Entity
@Table(name="PERIODISTAS")
public class Journalist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CODIGO_PERIODISTA")
    private Long idJournalist;
    @Column(name="NOMBRE")
    private String name;
    @Column(name="DIRECCION")
    private String address;
    @Column(name="TELEFONO")
    private String phone;
    @Column(name="NUMERO_NOTICIAS")
    private int numberNews;
   /* @OneToMany(mappedBy = "journalist")
    private List<JournalistNews> journalistNews;
*/

    @OneToMany(mappedBy = "codigoPeriodista")
    private List<News> newsList;

    public Journalist() {
    }

    public Journalist(String name, String address, String phone, int numberNews) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numberNews = numberNews;
    }

    /*public List<JournalistNews> getJournalistNews() {
        return journalistNews;
    }

    public void setJournalistNews(List<JournalistNews> journalistNews) {
        this.journalistNews = journalistNews;
    }*/

    public Long getIdJournalist() {
        return idJournalist;
    }

    public void setIdJournalist(Long id) {
        this.idJournalist = id;
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
                "id=" + idJournalist +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", numberNews=" + numberNews +
                '}';
    }

}
