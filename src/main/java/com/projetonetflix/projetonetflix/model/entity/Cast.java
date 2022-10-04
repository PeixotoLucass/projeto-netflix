package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Entity
@Table(name = "NAME_CAST")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "titleList", "actors"})
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_NAME_CAST")
    private Integer id;

    @ManyToMany
    @JoinTable(name = "CAST_ACTOR", joinColumns = @JoinColumn(name = "IDT_ACTOR"),
            inverseJoinColumns = @JoinColumn(name = "IDT_NAME_CAST"))
    private List<Actor> actors;

    @ManyToMany(mappedBy = "casts",fetch = FetchType.LAZY)
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

    public List<Title> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<Title> titleList) {
        this.titleList = titleList;
    }
}
