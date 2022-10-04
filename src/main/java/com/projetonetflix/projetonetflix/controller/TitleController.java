package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.TitleDTO;
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

    /*@GetMapping
    public Iterable<Title> getTitle() {
        return titleService.findAll();
    }*/
    @GetMapping
    public List<TitleDTO> findAll(){
        List<Title> listTitle = titleService.findAll();
        List<TitleDTO> listDTO = listTitle.stream().map(obj -> new TitleDTO(obj)).collect(Collectors.toList());
        return listDTO;
    }

    @GetMapping(path = "/{name}")
    public List<TitleDTO> getByName(@PathVariable String name){
        List<Title> listTitle = titleService.findByName(name);
        List<TitleDTO> listDTO = listTitle.stream().map(obj -> new TitleDTO(obj)).collect(Collectors.toList());
        return listDTO;
    }

}
