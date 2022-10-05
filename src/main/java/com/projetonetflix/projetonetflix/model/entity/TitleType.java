package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TITLE_TYPE")
public class TitleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_TITLE_TYPE")
    private Integer id;

    @Column(name = "NAM_TYPE")
    private String name;

    public TitleType() {
    }

    public TitleType(Integer id, String name) {
        this.id = id;
        this.name = name;
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

}
