package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
@Table(name = "DIRECTOR")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_DIRECTOR")
    private Long id;

    @Column(name = "NAM_DIRECTOR")
    private String name;

    @Column(name = "NUM_AGE_DIRECTOR")
    private Integer age;

    @ManyToMany
    @JoinTable(name = "DIRECTION", joinColumns = @JoinColumn(name = "IDT_TITLE"),
            inverseJoinColumns = @JoinColumn(name = "IDT_DIRECTOR"))
    private List<Title> titleList;

    public Director() {
    }

    public Director(Long id, String name, Integer age, List<Title> titleList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.titleList = titleList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
