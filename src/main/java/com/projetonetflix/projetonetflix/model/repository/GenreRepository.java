package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenreRepository extends CrudRepository<Genre, Integer> {

  public List<Genre> findByNameIgnoreCase(String name);

  public List<Genre> findByNameContainingIgnoreCase(String name);

}
