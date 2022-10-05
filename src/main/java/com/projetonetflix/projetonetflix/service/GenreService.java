package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.model.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

  @Autowired
  private GenreRepository genreRepository;

  public List<Genre> findAll() {
    return (List<Genre>) genreRepository.findAll();
  }

  public List<Genre> findByNameIgnoreCase(String name) {
    return genreRepository.findByNameIgnoreCase(name);
  }

  public List<Genre> findByNameContainingIgnoreCase(String name) {
    return genreRepository.findByNameContainingIgnoreCase(name);
  }

}
