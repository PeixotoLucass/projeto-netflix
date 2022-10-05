package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Title;
import java.util.List;
import java.util.stream.Collectors;

public class DirectorDTO {

  private final String name;
  private final int age;

  private List<TitleDTO> titleList;

  public DirectorDTO(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public DirectorDTO(Director director) {

    List<Title> listTitle = (List<Title>) director.getTitleList();

    this.name = director.getName();
    this.age = director.getAge();
    this.titleList = listTitle.stream()
        .map(obj -> new TitleDTO(obj))
        .collect(Collectors.toList());

  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public List<TitleDTO> getTitleList() {
    return titleList;
  }

  public void setTitleList(List<TitleDTO> titleList) {
    this.titleList = titleList;
  }
}
