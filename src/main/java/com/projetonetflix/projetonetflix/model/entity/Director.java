package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Entity
@Table(name = "DIRECTOR")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_DIRECTOR")
    private Long id;

    @Column(name = "NAM_DIRECTOR")
    private String nameDirector;

    @Column(name = "NUM_AGE_DIRECTOR")
    private int numAgeDirector;

    public Director() {
    }

    public Director(Long id, String namDirector, int numAgeDirector) {
        this.id = id;
        this.nameDirector = namDirector;
        this.numAgeDirector = numAgeDirector;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }

    public int getNumAgeDirector() {
        return numAgeDirector;
    }

    public void setNumAgeDirector(int numAgeDirector) {
        this.numAgeDirector = numAgeDirector;
    }

}
