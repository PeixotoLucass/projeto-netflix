package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.model.entity.Cast;
import com.projetonetflix.projetonetflix.model.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/netflix/cast")
public class CastController {

  @Autowired
  CastRepository castRepository;

  @GetMapping
  public Iterable<Cast> getCast() {
    return castRepository.findAll();
  }
}
