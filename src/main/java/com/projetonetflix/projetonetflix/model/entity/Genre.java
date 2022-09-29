package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "GENRE")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_GENRE")
    private Integer id;

    @Column(name = "NAM_GENRE")
    private String name;

    @ManyToMany
    @JoinTable(name = "TITLE_GENRE", joinColumns = @JoinColumn(name = "IDT_TITLE"),
            inverseJoinColumns = @JoinColumn(name = "IDT_GENRE"))
    private List<Title> titleGenre;

    public Genre() {
    }

    public Genre(Integer id, String name, List<Title> titleGenre) {
        this.id = id;
        this.name = name;
        this.titleGenre = titleGenre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Title> getTitleGenre() {
        return titleGenre;
    }

    public void setTitleGenre(List<Title> titleGenre) {
        this.titleGenre = titleGenre;
    }
}


