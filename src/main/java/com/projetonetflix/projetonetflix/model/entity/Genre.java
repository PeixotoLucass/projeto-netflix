package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
@Table(name = "GENRE")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_GENRE")
    private Long id;

    @Column(name = "NAM_GENRE")
    private String name;

    @ManyToMany
    @JoinTable(name = "TITLE_GENRE", joinColumns = @JoinColumn(name = "IDT_TITLE"),
            inverseJoinColumns = @JoinColumn(name = "IDT_GENRE"))
    private List<Title> titles;

    public Genre() {
    }

    public Genre(Long id, String name, List<Title> titles) {
        this.id = id;
        this.name = name;
        this.titles = titles;
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

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }
}


