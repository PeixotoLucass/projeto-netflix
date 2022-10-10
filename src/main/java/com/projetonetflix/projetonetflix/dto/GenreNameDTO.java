package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Genre;

public class GenreNameDTO {

  private final String name;

  public GenreNameDTO(Genre genre){
    this.name = genre.getName();
  }

  public GenreNameDTO(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
