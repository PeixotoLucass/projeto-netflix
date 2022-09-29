package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Genre;

public class GenreDTO {

    private String name;

    public GenreDTO() {
    }

    public GenreDTO(Genre genre) {
        this.name = genre.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
