package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Actor;

public class ActorDTO {

    private String name;

    private Integer age;

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
