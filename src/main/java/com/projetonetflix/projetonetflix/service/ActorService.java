package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

  @Autowired
  private ActorRepository actorRepository;

  public List<Actor> findAll() {
    return (List<Actor>) actorRepository.findAll();
  }

  public List<Actor> findByName(String name) {
    return actorRepository.findByName(name);
  }

  public List<Actor> findByNameIgnoreCase(String name) {
    return actorRepository.findByNameIgnoreCase(name);
  }

  public List<Actor> findByNameContainingIgnoreCase(String name) {
    return actorRepository.findByNameContainingIgnoreCase(name);
  }

}
