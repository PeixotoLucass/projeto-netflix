package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.model.entity.Title;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TitleDTO {

  private String name;
  private String classification;
  private LocalDate dateLaunch;
  private String duration;
  private List<GenreNameDTO> genres;

  public TitleDTO() {
  }

  public TitleDTO(Title title) {

    List<Genre> genre = title.getGenres();

    this.name = title.getName();
    this.classification = title.getClassification();
    this.dateLaunch = title.getDateLaunch();
    this.duration = title.getDuration();
    this.genres = genre.stream()
        .map(genres -> new GenreNameDTO(genres))
        .collect(Collectors.toList());


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

  public List<GenreNameDTO> getGenres() {
    return genres;
  }

  public void setGenres(List<GenreNameDTO> genres) {
    this.genres = genres;
  }
}


