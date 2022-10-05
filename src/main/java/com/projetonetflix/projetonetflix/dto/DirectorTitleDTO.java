package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Director;

public class DirectorTitleDTO {

  private final String name;

  public DirectorTitleDTO(Director director) {
    this.name = director.getName();
  }

  public String getName() {
    return name;
  }
}
