package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "GENRE")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_GENRE")
    private Long id;

    @Column(name = "NAM_GENRE")
    private String namGenre;

    public Genre() {
    }

    public Genre(Long id, String namGenre) {
        this.id = id;
        this.namGenre = namGenre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamGenre() {
        return namGenre;
    }

    public void setNamGenre(String namGenre) {
        this.namGenre = namGenre;
    }
}


