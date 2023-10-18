package com.uptc.frw.graphql.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERIODISTAS_ENTREVISTA_PERSONA_IMPLICADA")
public class JournalistInterviewPerson {
    @Id
    @Column(name = "codigo_periodista")
    private int codigo_periodista;
    @Column(name = "codigo_implicado")
    private int codigo_implicado;
    @Column(name = "codigo_noticia")
    private int codigo_noticia;

    public JournalistInterviewPerson() {
    }

    public JournalistInterviewPerson(int codigo_periodista, int codigo_implicado, int codigo_noticia) {
        this.codigo_periodista = codigo_periodista;
        this.codigo_implicado = codigo_implicado;
        this.codigo_noticia = codigo_noticia;
    }

    public int getCodigo_periodista() {
        return codigo_periodista;
    }

    public void setCodigo_periodista(int codigo_periodista) {
        this.codigo_periodista = codigo_periodista;
    }

    public int getCodigo_implicado() {
        return codigo_implicado;
    }

    public void setCodigo_implicado(int codigo_implicado) {
        this.codigo_implicado = codigo_implicado;
    }

    public int getCodigo_noticia() {
        return codigo_noticia;
    }

    public void setCodigo_noticia(int codigo_noticia) {
        this.codigo_noticia = codigo_noticia;
    }

    @Override
    public String toString() {
        return "JournalistInterviewPerson{" +
                "codigo_periodista=" + codigo_periodista +
                ", codigo_implicado=" + codigo_implicado +
                ", codigo_noticia=" + codigo_noticia +
                '}';
    }
}
