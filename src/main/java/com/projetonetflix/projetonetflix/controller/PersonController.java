package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.model.repository.PersontRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/netflix/person")
public class PersonController {

    @Autowired
    private PersontRepository personRepository;
}
