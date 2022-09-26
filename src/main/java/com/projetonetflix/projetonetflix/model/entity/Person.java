package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_PERSON")
    private Long id;

    @Column(name = "NAM_PERSON")
    private String namePerson;

    @Column(name = "NAM_LOGIN")
    private String nameLogin;

    @Column(name = "COD_PASSWORD")
    private String codPassword;

    public Person() {
    }

    public Person(Long id, String namPerson, String namLogin, String codPassword) {
        this.id = id;
        this.namePerson = namPerson;
        this.nameLogin = namLogin;
        this.codPassword = codPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getNameLogin() {
        return nameLogin;
    }

    public void setNameLogin(String nameLogin) {
        this.nameLogin = nameLogin;
    }

    public String getCodPassword() {
        return codPassword;
    }

    public void setCodPassword(String codPassword) {
        this.codPassword = codPassword;
    }
}

