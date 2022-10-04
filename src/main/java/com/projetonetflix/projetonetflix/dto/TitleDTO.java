package com.projetonetflix.projetonetflix.dto;


import com.projetonetflix.projetonetflix.model.entity.Cast;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Title;

import java.time.LocalDate;
import java.util.List;

public class TitleDTO {

    private String classification;

    private LocalDate dateLaunch;

    private String name;

    private String duration;

    private List<Director> directorList;

    private List<Cast> castList;

    public TitleDTO() {
    }

    public TitleDTO(Title title) {
        this.classification = title.getClassification();
        this.dateLaunch = title.getDateLaunch();
        this.name = title.getName();
        this.duration = title.getDuration();
        this.directorList = title.getDirectors();
        this.castList = title.getCasts();

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

    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

}
