package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import java.util.List;
import java.util.stream.Collectors;

public class ActorDTO {

  private final String name;

  private final Integer age;

  private final List<TitleNameDTO> titleList;

  public ActorDTO(Integer age, List<TitleNameDTO> titleList, String name) {
    this.name = name;
    this.age = age;
    this.titleList = titleList;
  }

  public ActorDTO(Actor actor, List<TitleNameDTO> titleList) {
    this.name = actor.getName();
    this.age = actor.getAge();
    this.titleList = titleList;
  }

  public ActorDTO(String name, Integer age, List<TitleNameDTO> titleList) {
    this.name = name;
    this.age = age;
    this.titleList = titleList;
  }

  public ActorDTO(Actor actor) {
    this.name = actor.getName();
    this.age = actor.getAge();
    this.titleList = actor.getCasts().stream()
        .map(cast -> cast.getTitleList())
        .flatMap(titles -> titles.stream())
        .map(title -> new TitleNameDTO(title))
        .collect(Collectors.toList());
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public List<TitleNameDTO> getTitleList() {
    return titleList;
  }

}
