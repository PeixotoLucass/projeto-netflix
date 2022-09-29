package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.model.entity.Title;
import com.projetonetflix.projetonetflix.model.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {

    @Autowired
    private TitleRepository titleRepository;

    public List<Title> findAll() {
        return (List<Title>) titleRepository.findAll();
    }
    public List<Title> findByName(String name){
        return titleRepository.findByName(name);
    }

}
