package com.projetonetflix.projetonetflix.dto;



public class DirectorDTO {

    private String name;
    private int age;

    public DirectorDTO() {
    }

    public DirectorDTO(Director director) {

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

}
