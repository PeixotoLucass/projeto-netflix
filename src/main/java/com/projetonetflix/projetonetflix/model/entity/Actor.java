package com.projetonetflix.projetonetflix.model.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Entity
@Table(name = "ACTOR")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_ACTOR")
    private Long id;

    @Column(name = "NAM_ACTOR")
    private String nameActor;

    @Column(name = "NUM_AGE_ACTOR")
    private int numAge;

    public Actor() {
    }

    public Actor(Long id, String namActor, int numAge) {
        this.id = id;
        this.nameActor = namActor;
        this.numAge = numAge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameActor() {
        return nameActor;
    }

    public void setNameActor(String nameActor) {
        this.nameActor = nameActor;
    }

    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }
}
