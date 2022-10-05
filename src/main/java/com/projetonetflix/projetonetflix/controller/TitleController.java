package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.TitleDirectorDTO;
import com.projetonetflix.projetonetflix.model.entity.Title;
import com.projetonetflix.projetonetflix.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/netflix/title")
public class TitleController {

  @Autowired
  private TitleService titleService;

  @GetMapping
  public List<TitleDirectorDTO> findAll() {
    List<Title> listTitle = titleService.findAll();
    List<TitleDirectorDTO> listDTO = listTitle.stream()
        .map(title -> new TitleDirectorDTO(title))
        .collect(Collectors.toList());
    return listDTO;
  }

  @GetMapping(path = "/{name}")
  public List<TitleDirectorDTO> getByNameContainingIgnoreCase(@PathVariable String name) {
    List<Title> listTitle = titleService.findByNameContainingIgnoreCase(name);
    List<TitleDirectorDTO> listDTO = listTitle.stream()
        .map(title -> new TitleDirectorDTO(title))
        .collect(Collectors.toList());
    return listDTO;
  }

}
