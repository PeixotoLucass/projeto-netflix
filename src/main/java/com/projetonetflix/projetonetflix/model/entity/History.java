package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HISTORY")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_HISTORY")
    private Long id;

    @Column(name = "DAT_HISTORY")
    private Date datHistory;

    @Column(name = "IDT_PERSON")
    private Long idtPerson;

    @Column(name = "IDT_TITLE")
    private Long idtTitle;

    public History() {
    }

    public History(Long id, Date datHistory, Long idtPerson, Long idtTitle) {
        this.id = id;
        this.datHistory = datHistory;
        this.idtPerson = idtPerson;
        this.idtTitle = idtTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatHistory() {
        return datHistory;
    }

    public void setDatHistory(Date datHistory) {
        this.datHistory = datHistory;
    }

    public Long getIdtPerson() {
        return idtPerson;
    }

    public void setIdtPerson(Long idtPerson) {
        this.idtPerson = idtPerson;
    }

    public Long getIdtTitle() {
        return idtTitle;
    }

    public void setIdtTitle(Long idtTitle) {
        this.idtTitle = idtTitle;
    }
}
