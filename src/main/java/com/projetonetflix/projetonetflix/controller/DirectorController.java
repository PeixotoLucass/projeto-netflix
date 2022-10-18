package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.DirectorDTO;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.service.DirectorService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/netflix/director")
public class DirectorController {

  @Autowired
  private DirectorService directorService;

  @GetMapping
  public List<DirectorDTO> getDirectors() {
    List<Director> listDirector = directorService.findAll();
    List<DirectorDTO> listDTO = listDirector.stream()
        .map(director -> new DirectorDTO(director))
        .collect(Collectors.toList());
    return listDTO;
  }

  @GetMapping(path = "{name}")
  public List<DirectorDTO> getByNameContains(@PathVariable String name) {
    List<Director> listDirector = directorService.findByNameContainingIgnoreCase(name);
    List<DirectorDTO> listDTO = listDirector.stream()
        .map(director -> new DirectorDTO(director))
        .collect(Collectors.toList());
    return listDTO;
  }

}
