package com.projetonetflix.projetonetflix.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.projetonetflix.projetonetflix.dto.TitleDTO;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name = "TITLE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "genres", "directors"})//Se colocar isso ele não traz genres e nem directors
//se não usar o JsonIgnoreProperties ele traz só o id de genre e director.
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_TITLE")
    private Integer id;

    @Column(name = "DES_CLASSIFICATION")
    private String classification;

    @Column(name = "DAT_LAUNCH")
    private LocalDate dateLaunch;

    @Column(name = "NAM_TITLE")
    private String name;

    @Column(name = "VAL_DURATION")
    private String duration;

    @Column(name = "IDT_NAM_CAST")
    private Integer cast;

    @Column(name = "IDT_TITLE_TYPE")
    private Integer type;


    @ManyToMany
    @JoinTable(name = "CAST_ACTOR", joinColumns = @JoinColumn(name = "IDT_NAM_CAST"),
            inverseJoinColumns = @JoinColumn(name = "IDT_ACTOR"))
    private List<Cast> casts;

    @ManyToMany(mappedBy = "titleList",fetch = FetchType.LAZY)
    private List<Director> directors;

    @ManyToMany(mappedBy = "titleGenre",fetch = FetchType.EAGER)
    private List<Genre> genres;

    public Title() {
    }

    public Title(Integer id, String classification, LocalDate dateLaunch, String name, String duration,
                 Integer cast, Integer type, List<Genre> genres, List<Director> directors) {
        this.id = id;
        this.classification = classification;
        this.dateLaunch = dateLaunch;
        this.name = name;
        this.duration = duration;
        this.cast = cast;
        this.type = type;
        this.genres = genres;
        this.directors = directors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public LocalDate getDateLaunch() {
        return dateLaunch;
    }

    public void setDateLaunch(LocalDate dateLaunch) {
        this.dateLaunch = dateLaunch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getCast() {
        return cast;
    }

    public void setCast(Integer cast) {
        this.cast = cast;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

}
