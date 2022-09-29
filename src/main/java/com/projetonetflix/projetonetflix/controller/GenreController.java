package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.DirectorDTO;
import com.projetonetflix.projetonetflix.dto.GenreDTO;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.model.repository.GenreRepository;
import com.projetonetflix.projetonetflix.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/netflix/genre")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @RequestMapping
    public List<GenreDTO> getGenres(){
        List<Genre> listGenre = genreService.findAll();
        List<GenreDTO> listDTO = listGenre.stream().map(obj -> new GenreDTO(obj)).collect(Collectors.toList());
        return listDTO;
    }


}
