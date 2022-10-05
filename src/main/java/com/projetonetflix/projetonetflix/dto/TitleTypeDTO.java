package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.TitleType;

public class TitleTypeDTO {

  private final String name;

  public TitleTypeDTO(TitleType type) {
    this.name = type.getName();
  }

  public String getName() {
    return name;
  }

}
