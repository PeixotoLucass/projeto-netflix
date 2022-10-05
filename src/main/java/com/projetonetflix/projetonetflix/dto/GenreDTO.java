package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.model.entity.Title;
import java.util.List;
import java.util.stream.Collectors;

public class GenreDTO {

  private final String name;

  private final List<TitleDTO> titles;

  public GenreDTO(String name, List<TitleDTO> titles) {
    this.name = name;
    this.titles = titles;
  }

  public GenreDTO(Genre genre) {
    List<Title> listTitle = (List<Title>) genre.getTitleGenre();

    this.name = genre.getName();
    this.titles = listTitle.stream()
        .map(obj -> new TitleDTO(obj))
        .collect(Collectors.toList());
  }

  public String getName() {
    return name;
  }

  public List<TitleDTO> getTitles() {
    return titles;
  }

}
