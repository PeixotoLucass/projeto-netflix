package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.model.entity.TitleType;
import com.projetonetflix.projetonetflix.model.repository.TitleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleTypeService {

  @Autowired
  TitleTypeRepository titleTypeRepository;

  public List<TitleType> findAll() {
    return (List<TitleType>) titleTypeRepository.findAll();
  }
}
