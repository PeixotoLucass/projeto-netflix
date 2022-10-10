package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.ActorDTO;
import com.projetonetflix.projetonetflix.dto.AllDTO;
import com.projetonetflix.projetonetflix.dto.DirectorDTO;
import com.projetonetflix.projetonetflix.dto.DirectorTitleDTO;
import com.projetonetflix.projetonetflix.dto.TitleDTO;
import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Title;
import com.projetonetflix.projetonetflix.service.ActorService;
import com.projetonetflix.projetonetflix.service.DirectorService;
import com.projetonetflix.projetonetflix.service.GenreService;
import com.projetonetflix.projetonetflix.service.TitleService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/netflix")
public class FindAllController {

  @Autowired
  TitleService titleService;

  @Autowired
  DirectorService directorService;

  @Autowired
  ActorService actorService;

  @Autowired
  GenreService genreService;

  @GetMapping()
  public AllDTO getByParam(@RequestParam(required = false) String titles,
      @RequestParam(required = false) String actors,
      @RequestParam(required = false) String directors) {

    List<Title> titleList = titleService.findByNameContainingIgnoreCase(titles);
    List<TitleDTO> listTitle = titleList.stream()
        .map(title -> new TitleDTO(title))
        .collect(Collectors.toList());

    List<Director> directorList = directorService.findByNameContainingIgnoreCase(directors);
    List<DirectorDTO> listDirector = directorList.stream()
        .map(director -> new DirectorDTO(director))
        .collect(Collectors.toList());

    List<Actor> actorList = actorService.findByNameContainingIgnoreCase(actors);
    List<ActorDTO> listActor = actorList.stream()
        .map(actor -> new ActorDTO(actor))
        .collect(Collectors.toList());

    AllDTO all;
    all = new AllDTO(listTitle, listDirector, listActor);
    return all;
  }

  @GetMapping(path = "{name}")
  public AllDTO getByAll(@PathVariable String name) {
    List<Title> titleList = titleService.findByNameContainingIgnoreCase(name);
    List<TitleDTO> listTitle = titleList.stream()
        .map(title -> new TitleDTO(title))
        .collect(Collectors.toList());

    List<Director> directorList = directorService.findByNameContainingIgnoreCase(name);
    List<DirectorDTO> listDirector = directorList.stream()
        .map(director -> new DirectorDTO(director))
        .collect(Collectors.toList());

    List<Actor> actorList = actorService.findByNameContainingIgnoreCase(name);
    List<ActorDTO> listActor = actorList.stream()
        .map(actor -> new ActorDTO(actor))
        .collect(Collectors.toList());

    AllDTO all;
    all = new AllDTO(listTitle, listDirector, listActor);
    return all;
  }

}
