package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.TitleTypeDTO;
import com.projetonetflix.projetonetflix.model.entity.TitleType;
import com.projetonetflix.projetonetflix.service.TitleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/netflix/titleType")
public class TitleTypeController {

    @Autowired
    TitleTypeService titleTypeService;

    @GetMapping
    public List<TitleTypeDTO> findAll(){
        List<TitleType> listActor = titleTypeService.findAll();
        List<TitleTypeDTO> listDTO = listActor.stream().map(obj -> new TitleTypeDTO(obj)).collect(Collectors.toList());
        return listDTO;
    }
}
