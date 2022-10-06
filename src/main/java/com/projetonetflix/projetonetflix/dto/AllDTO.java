package com.projetonetflix.projetonetflix.dto;

import java.util.List;

public class AllDTO {

  private List<DirectorDTO> directors;

  private List<ActorDTO> actors;

  private List<TitleDTO> titles;

  public AllDTO() {
  }

  public AllDTO(List<TitleDTO> titles, List<DirectorDTO> directors, List<ActorDTO> actors) {
    this.titles = titles;
    this.directors = directors;
    this.actors = actors;
  }

  public List<TitleDTO> getTitles() {
    return titles;
  }

  public void setTitles(List<TitleDTO> titles) {
    this.titles = titles;
  }

  public List<DirectorDTO> getDirectors() {
    return directors;
  }

  public void setDirectors(
      List<DirectorDTO> directors) {
    this.directors = directors;
  }

  public List<ActorDTO> getActors() {
    return actors;
  }

  public void setActors(List<ActorDTO> actors) {
    this.actors = actors;
  }
}
