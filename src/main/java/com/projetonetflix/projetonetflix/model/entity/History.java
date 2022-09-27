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
    private LocalDate datHistory;

    @Column(name = "IDT_PERSON")
    private Integer idtPerson;

    @Column(name = "IDT_TITLE")
    private Integer idtTitle;

    public History() {
    }

    public History(Integer id, LocalDate datHistory, Integer idtPerson, Integer idtTitle) {
        this.id = id;
        this.datHistory = datHistory;
        this.idtPerson = idtPerson;
        this.idtTitle = idtTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDatHistory() {
        return datHistory;
    }

    public void setDatHistory(LocalDate datHistory) {
        this.datHistory = datHistory;
    }

    public Integer getIdtPerson() {
        return idtPerson;
    }

    public void setIdtPerson(Integer idtPerson) {
        this.idtPerson = idtPerson;
    }

    public Integer getIdtTitle() {
        return idtTitle;
    }

    public void setIdtTitle(Integer idtTitle) {
        this.idtTitle = idtTitle;
    }
}


