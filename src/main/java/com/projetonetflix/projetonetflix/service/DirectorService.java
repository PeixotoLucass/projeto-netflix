package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

  @Autowired
  private DirectorRepository directorRepository;

  public List<Director> findAll() {
    return (List<Director>) directorRepository.findAll();
  }

  public List<Director> findByName(String name) {
    return directorRepository.findByName(name);
  }

  public List<Director> findByNameContainingIgnoreCase(String name) {
    return directorRepository.findByNameContainingIgnoreCase(name);
  }

}
