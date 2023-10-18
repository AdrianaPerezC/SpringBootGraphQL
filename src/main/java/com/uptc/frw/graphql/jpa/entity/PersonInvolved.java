package com.uptc.frw.graphql.jpa.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="PERSONA_IMPLICADA")
public class PersonInvolved {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_IMPLICADO")
    private Long id;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "FECHA_NACIMIENTO")
    private Date birthday;
    @Column(name = "CALIDAD_IMPLICADO")
    private String qualityInvolved;

    public PersonInvolved() {
    }

    public PersonInvolved(String name, Date birthday, String qualityInvolved) {
        this.name = name;
        this.birthday = birthday;
        this.qualityInvolved = qualityInvolved;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQualityInvolved() {
        return qualityInvolved;
    }

    public void setQualityInvolved(String qualityInvolved) {
        this.qualityInvolved = qualityInvolved;
    }

    @Override
    public String toString() {
        return "PersonInvolved{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", qualityInvolved='" + qualityInvolved + '\'' +
                '}';
    }
}

}