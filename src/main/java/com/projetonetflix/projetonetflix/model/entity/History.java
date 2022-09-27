package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import java.time.LocalDate;


@Entity
@Table(name = "HISTORY")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_HISTORY")
    private Integer id;

    @Column(name = "DAT_HISTORY")
    private LocalDate dataHistory;

    @Column(name = "IDT_PERSON")
    private Integer personId;

    @Column(name = "IDT_TITLE")
    private Integer titleId;

    public History() {
    }

    public History(Integer id, LocalDate dataHistory, Integer personId, Integer titleId) {
        this.id = id;
        this.dataHistory = dataHistory;
        this.personId = personId;
        this.titleId = titleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataHistory() {
        return dataHistory;
    }

    public void setDataHistory(LocalDate dataHistory) {
        this.dataHistory = dataHistory;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }
}


