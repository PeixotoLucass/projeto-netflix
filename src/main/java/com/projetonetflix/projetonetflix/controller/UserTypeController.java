package com.projetonetflix.projetonetflix.controller;

import com.projetonetflix.projetonetflix.model.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/netflix/user")
public class UserTypeController {

    @Autowired
    UserTypeRepository userTypeRepository;
}
