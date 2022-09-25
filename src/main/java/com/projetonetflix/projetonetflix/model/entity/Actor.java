package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "ACTOR")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_ACTOR")
    private Long id;

    @Column(name = "NAM_ACTOR")
    private String NamActor;

    @Column(name = "NUM_AGE_ACTOR")
    private int numAge;

    public Actor() {
    }

    public Actor(Long id, String namActor, int numAge) {
        this.id = id;
        NamActor = namActor;
        this.numAge = numAge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamActor() {
        return NamActor;
    }

    public void setNamActor(String namActor) {
        NamActor = namActor;
    }

    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }
}
