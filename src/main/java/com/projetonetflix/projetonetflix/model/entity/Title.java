package com.projetonetflix.projetonetflix.model.entity;

import javax.persistence.*;

@Entity
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_TITLE")
    private Long id;

    @Column(name = "DES_CLASSIFICATION")
    private String desClassification;

    @Column(name = "DAT_LAUNCH")
    private String datLaunch;

    @Column(name = "NAM_TITLE")
    private String namTitle;

    @Column(name = "VAL_DURATION")
    private String valDuration;

    @Column(name = "IDT_NAM_CAST")
    private Long idtNamCast;

    @Column(name = "IDT_TITLE_TYPE")
    private Long idtTitleType;

    public Title() {
    }

    public Title(Long id, String desClassification, String datLaunch, String namTitle, String valDuration, Long idtNamCast, Long idtTitleType) {
        this.id = id;
        this.desClassification = desClassification;
        this.datLaunch = datLaunch;
        this.namTitle = namTitle;
        this.valDuration = valDuration;
        this.idtNamCast = idtNamCast;
        this.idtTitleType = idtTitleType;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesClassification() {
        return desClassification;
    }

    public void setDesClassification(String desClassification) {
        this.desClassification = desClassification;
    }

    public String getDatLaunch() {
        return datLaunch;
    }

    public void setDatLaunch(String datLaunch) {
        this.datLaunch = datLaunch;
    }

    public String getNamTitle() {
        return namTitle;
    }

    public void setNamTitle(String namTitle) {
        this.namTitle = namTitle;
    }

    public String getValDuration() {
        return valDuration;
    }

    public void setValDuration(String valDuration) {
        this.valDuration = valDuration;
    }

    public Long getIdtNamCast() {
        return idtNamCast;
    }

    public void setIdtNamCast(Long idtNamCast) {
        this.idtNamCast = idtNamCast;
    }

    public Long getIdtTitleType() {
        return idtTitleType;
    }

    public void setIdtTitleType(Long idtTitleType) {
        this.idtTitleType = idtTitleType;
    }
}
