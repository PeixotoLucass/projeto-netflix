package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Director;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DirectorRepository extends CrudRepository<Director, Integer> {

  public List<Director> findByName(String name);

  public List<Director> findByNameIgnoreCase(String name);

  public List<Director> findByNameContainingIgnoreCase(String name);

}
