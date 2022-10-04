package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.entity.Title;


import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.stream.Collectors;

public class ActorDTO {

    private String name;

    private Integer age;

    private List<Title> titleList;

    public ActorDTO() {
    }

    public ActorDTO(Actor actor) {
        this.name = actor.getName();
        this.age = actor.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
