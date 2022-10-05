package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.GenreDTO;
import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  public List<GenreDTO> getGenres() {
    List<Genre> listGenre = genreService.findAll();
    List<GenreDTO> listDTO = listGenre.stream()
        .map(genre -> new GenreDTO(genre))
        .collect(Collectors.toList());
    return listDTO;
  }

  @GetMapping(path = "{name}")
  public List<GenreDTO> getByNameContainingIgnoreCase(@PathVariable String name) {
    List<Genre> listDirector = genreService.findByNameContainingIgnoreCase(name);
    List<GenreDTO> listDTO = listDirector.stream()
        .map(genre -> new GenreDTO(genre))
        .collect(Collectors.toList());
    return listDTO;
  }

}
