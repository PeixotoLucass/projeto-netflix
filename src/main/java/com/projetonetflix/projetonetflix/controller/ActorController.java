package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.ActorDTO;
import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/netflix/actor")
public class ActorController {

  @Autowired
  private ActorService actorService;

  @GetMapping
  public List<ActorDTO> findAll() {
    List<Actor> listActor = actorService.findAll();
    List<ActorDTO> listDTO = listActor.stream()
        .map(actor -> new ActorDTO(actor))
        .collect(Collectors.toList());
    return listDTO;
  }

  @GetMapping(path = "{name}")
  public List<ActorDTO> getByNameContainingIgnoreCase(@PathVariable String name) {
    List<Actor> listActor = actorService.findByNameContainingIgnoreCase(name);
    List<ActorDTO> listDTO = listActor.stream()
        .map(actor -> new ActorDTO(actor))
        .collect(Collectors.toList());
    return listDTO;
  }

}
