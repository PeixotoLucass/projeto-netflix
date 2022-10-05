package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Title;

public class TitleDTO {

  private final String name;

  public TitleDTO(String name) {
    this.name = name;
  }

  public TitleDTO(Title title) {
    this.name = title.getName();
  }

  public String getName() {
    return name;
  }

}
