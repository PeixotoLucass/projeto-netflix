package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "DIRECTOR")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_DIRECTOR")
    private Long id;

    @Column(name = "NAM_DIRECTOR")
    private String namDirector;

    @Column(name = "NUM_AGE_DIRECTOR")
    private int numAgeDirector;

    public Director() {
    }

    public Director(Long id, String namDirector, int numAgeDirector) {
        this.id = id;
        this.namDirector = namDirector;
        this.numAgeDirector = numAgeDirector;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamDirector() {
        return namDirector;
    }

    public void setNamDirector(String namDirector) {
        this.namDirector = namDirector;
    }

    public int getNumAgeDirector() {
        return numAgeDirector;
    }

    public void setNumAgeDirector(int numAgeDirector) {
        this.numAgeDirector = numAgeDirector;
    }
}
