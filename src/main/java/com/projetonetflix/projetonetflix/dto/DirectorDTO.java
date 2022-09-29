package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Title;

import java.util.List;

public class DirectorDTO {

    private String name;
    private int age;

    private List<Title> titleList;

    public DirectorDTO() {
    }

    public DirectorDTO(Director director) {
        this.name = director.getName();
        this.age = director.getAge();
        this.titleList = director.getTitleList();
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

    public void setAge(int age) {
        this.age = age;
    }

    public List<Title> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<Title> titleList) {
        this.titleList = titleList;
    }

    public Director trasnformToObject(){
        return new Director(name,age,titleList);
    }

}
