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
    private Long id;
    @Column(name="NOMBRE")
    private String name;
    @Column(name="DIRECCION")
    private String address;
    @Column(name="TELEFONO")
    private String phone;
    @Column(name="NUMERO_NOTICIAS")
    private int numberNews;

    public Journalist() {
    }

    public Journalist(String name, String address, String phone, int numberNews) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numberNews = numberNews;
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
