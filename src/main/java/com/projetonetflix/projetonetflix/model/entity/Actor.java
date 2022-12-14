package com.projetonetflix.projetonetflix.model.entity;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACTOR")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "casts"})
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_ACTOR")
    private Integer id;

    @Column(name = "NAM_ACTOR")
    private String name;

    @Column(name = "NUM_AGE_ACTOR")
    private Integer age;

    @ManyToMany(mappedBy = "actors")
    private List<Cast> casts;

    public Actor() {
    }

    public Actor(Integer id, String name, Integer age, List<Cast> casts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.casts = casts;
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

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

}
