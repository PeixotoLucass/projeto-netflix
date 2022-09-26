package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;

@Entity
@Table(name = "TITLE_TYPE")
public class TitleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_TITLE_TYPE")
    private Long id;

    @Column(name = "NAM_TYPE")
    private String name;

    public TitleType() {
    }

    public TitleType(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
