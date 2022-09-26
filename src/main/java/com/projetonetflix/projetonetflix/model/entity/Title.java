package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_TITLE")
    private Long id;

    @Column(name = "DES_CLASSIFICATION")
    private String desClassification;

    @Column(name = "DAT_LAUNCH")
    private String datLaunch;

    @Column(name = "NAM_TITLE")
    private String name;

    @Column(name = "VAL_DURATION")
    private String duration;

    @Column(name = "IDT_NAM_CAST")
    private Long idtNamCast;

    @Column(name = "IDT_TITLE_TYPE")
    private Long idtTitleType;

    @ManyToMany(mappedBy = "titles")
    private List<Genre> genres;

    @ManyToMany(mappedBy = "titlesList")
    private List<Director> directors;

    public Title() {
    }

    public Title(Long id, String desClassification, String datLaunch, String name, String duration,
                 Long idtNamCast, Long idtTitleType, List<Genre> genres, List<Director> directors) {
        this.id = id;
        this.desClassification = desClassification;
        this.datLaunch = datLaunch;
        this.name = name;
        this.duration = duration;
        this.idtNamCast = idtNamCast;
        this.idtTitleType = idtTitleType;
        this.genres = genres;
        this.directors = directors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesClassification() {
        return desClassification;
    }

    public void setDesClassification(String desClassification) {
        this.desClassification = desClassification;
    }

    public String getDatLaunch() {
        return datLaunch;
    }

    public void setDatLaunch(String datLaunch) {
        this.datLaunch = datLaunch;
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

    public Long getIdtNamCast() {
        return idtNamCast;
    }

    public void setIdtNamCast(Long idtNamCast) {
        this.idtNamCast = idtNamCast;
    }

    public Long getIdtTitleType() {
        return idtTitleType;
    }

    public void setIdtTitleType(Long idtTitleType) {
        this.idtTitleType = idtTitleType;
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
