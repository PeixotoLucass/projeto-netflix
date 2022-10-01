package com.projetonetflix.projetonetflix.dto;


import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Title;
import java.util.List;
import java.util.stream.Collectors;


public class DirectorDTO {

    private String name;
    private int age;

    private List<TitleDTO> titleList;



    public DirectorDTO() {
    }

    public DirectorDTO(Director director) {

        List<Title> listTitle = (List<Title>) director.getTitleList();
        List<TitleDTO> listDTO = listTitle.stream().map(obj -> new TitleDTO(obj)).collect(Collectors.toList());

        this.name = director.getName();
        this.age = director.getAge();
        this.titleList = listDTO;

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


    public List<TitleDTO> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<TitleDTO> titleList) {
        this.titleList = titleList;
    }


    public List<Title> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<Title> titleList) {
        this.titleList = titleList;
    }

}
