package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TITLE_TYPE")
public class TitleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_TITLE_TYPE")
    private Long id;

    @Column(name = "NAM_TYPE")
    private String namType;

    public TitleType() {
    }

    public TitleType(Long id, String namType) {
        this.id = id;
        this.namType = namType;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamType() {
        return namType;
    }

    public void setNamType(String namType) {
        this.namType = namType;
    }
}
