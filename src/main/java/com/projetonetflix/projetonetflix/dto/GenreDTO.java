package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.model.entity.Title;

import java.util.List;
import java.util.stream.Collectors;

public class GenreDTO {

    private String name;

    private List<TitleDTO> titles;

    public GenreDTO() {
    }

    public GenreDTO(Genre genre) {
        List<Title> listTitle = (List<Title>) genre.getTitleGenre();
        List<TitleDTO> listDTO = listTitle.stream().map(obj -> new TitleDTO(obj)).collect(Collectors.toList());

        this.name = genre.getName();
        this.titles = listDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TitleDTO> getTitles() {
        return titles;
    }

    public void setTitles(List<TitleDTO> titles) {
        this.titles = titles;
    }
}
