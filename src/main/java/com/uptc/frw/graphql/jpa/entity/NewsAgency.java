package com.uptc.frw.graphql.jpa.entity;

import jdk.jfr.Enabled;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Year;
@Enabled
@Table(name = "AGENCIA_NOTICIAS")
public class NewsAgency {
 @Id
 @Column(name = "codigo_agencia")
private int  agencia_noticia;
@Column(name = "nombre")
private String nombre;
@Column(name = "anio_creacion")
private Year ano_creacion;

    public NewsAgency() {
    }

    public NewsAgency(int agencia_noticia, String nombre, Year ano_creacion) {
        this.agencia_noticia = agencia_noticia;
        this.nombre = nombre;
        this.ano_creacion = ano_creacion;
    }

    public int getAgencia_noticia() {
        return agencia_noticia;
    }

    public void setAgencia_noticia(int agencia_noticia) {
        this.agencia_noticia = agencia_noticia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Year getAno_creacion() {
        return ano_creacion;
    }

    public void setAno_creacion(Year ano_creacion) {
        this.ano_creacion = ano_creacion;
    }

    @Override
    public String toString() {
        return "NewsAgency{" +
                "agencia_noticia=" + agencia_noticia +
                ", nombre='" + nombre + '\'' +
                ", ano_creacion=" + ano_creacion +
                '}';
    }
}
