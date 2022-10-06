package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Title;

public class TitleNameDTO {

  private final String name;

  public TitleNameDTO(String name) {
    this.name = name;
  }

  public TitleNameDTO(Title title) {
    this.name = title.getName();
  }

  public String getName() {
    return name;
  }

}
