package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DIRECTOR")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_DIRECTOR")
    private Integer id;

    @Column(name = "NAM_DIRECTOR")
    private String name;

    @Column(name = "NUM_AGE_DIRECTOR")
    private Integer age;

    @ManyToMany()
    @JoinTable(name = "DIRECTION", joinColumns = @JoinColumn(name = "IDT_TITLE"),
            inverseJoinColumns = @JoinColumn(name = "IDT_DIRECTOR"))
    private List<Title> titleList;

    public Director() {
    }

    public Director(Integer id, String name, Integer age, List<Title> titleList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.titleList = titleList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Title> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<Title> titleList) {
        this.titleList = titleList;
    }
}
