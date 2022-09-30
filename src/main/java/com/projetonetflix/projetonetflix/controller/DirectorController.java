package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.DirectorDTO;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/netflix/director")
public class DirectorController {

    @Autowired
    private DirectorRepository directorRepository;


        List<Director> listDirector = (List<Director>) directorRepository.findAll();
        List<DirectorDTO> listDTO = listDirector.stream().map(obj -> new DirectorDTO(obj)).collect(Collectors.toList());
        return listDTO;
    }

}
