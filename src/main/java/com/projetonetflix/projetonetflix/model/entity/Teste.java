package com.projetonetflix.projetonetflix.model.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {

    @RequestMapping
    public String ola(){
        return "Opa bom? Funciona?";
    }
}
