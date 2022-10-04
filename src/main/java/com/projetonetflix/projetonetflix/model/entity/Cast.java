package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.List;

@Entity
@Table(name = "NAME_CAST")

public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_NAME_CAST")
    private Integer id;

    @ManyToMany
    @JoinTable(name = "CAST_ACTOR", joinColumns = @JoinColumn(name = "IDT_ACTOR"),
            inverseJoinColumns = @JoinColumn(name = "IDT_NAME_CAST"))
    private List<Actor> actors;


    @ManyToMany
    @JoinTable(name = "TITLE", joinColumns = @JoinColumn(name = "IDT_NAM_CAST"),
            inverseJoinColumns = @JoinColumn(name = "IDT_CAST"))
    private List<Title> titleList;

    public Cast() {
    }

    public Cast(Integer id, List<Actor> actors) {
        this.id = id;
        this.actors = actors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

}
