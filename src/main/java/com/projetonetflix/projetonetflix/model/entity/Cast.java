package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "NAME_CAST")
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_NAME_CAST")
    private Long id;

    public Cast() {
    }

    public Cast(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
