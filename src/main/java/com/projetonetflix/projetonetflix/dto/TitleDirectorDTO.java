package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Title;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TitleDirectorDTO {

    private String name;
    private String classification;
    private LocalDate dateLaunch;
    private String duration;
    private List<DirectorTitleDTO> directorList;

    public TitleDirectorDTO() {
    }

    public TitleDirectorDTO(Title title) {

        List<Director> listDirector = (List<Director>) title.getDirectors();
        List<DirectorTitleDTO> listDTO = listDirector.stream().map(director -> new DirectorTitleDTO(director)).collect(Collectors.toList());

        this.name = title.getName();
        this.classification = title.getClassification();
        this.dateLaunch = title.getDateLaunch();
        this.duration = title.getDuration();
        this.directorList = listDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<DirectorTitleDTO> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<DirectorTitleDTO> directorList) {
        this.directorList = directorList;
    }
}
