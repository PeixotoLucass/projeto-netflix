package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_PERSON")
    private Long id;

    @Column(name = "NAM_PERSON")
    private String namPerson;

    @Column(name = "NAM_LOGIN")
    private String namLogin;

    @Column(name = "COD_PASSWORD")
    private String codPassword;

    public Person() {
    }

    public Person(Long id, String namPerson, String namLogin, String codPassword) {
        this.id = id;
        this.namPerson = namPerson;
        this.namLogin = namLogin;
        this.codPassword = codPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamPerson() {
        return namPerson;
    }

    public void setNamPerson(String namPerson) {
        this.namPerson = namPerson;
    }

    public String getNamLogin() {
        return namLogin;
    }

    public void setNamLogin(String namLogin) {
        this.namLogin = namLogin;
    }

    public String getCodPassword() {
        return codPassword;
    }

    public void setCodPassword(String codPassword) {
        this.codPassword = codPassword;
    }

}
