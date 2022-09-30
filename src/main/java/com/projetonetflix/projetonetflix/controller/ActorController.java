package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.dto.ActorDTO;

import com.projetonetflix.projetonetflix.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/netflix/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<ActorDTO> findAll(){
        List<Actor> listActor = actorService.findAll();
        List<ActorDTO> listDTO = listActor.stream().map(obj -> new ActorDTO(obj)).collect(Collectors.toList());
        return listDTO;
    }


    public List<ActorDTO> getByName(@PathVariable String name){
        List<Actor> listActor = actorService.findByName(name);
        List<ActorDTO> listDTO = listActor.stream().map(obj -> new ActorDTO(obj)).collect(Collectors.toList());
        return listDTO;

}
