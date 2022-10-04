package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Title;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface TitleRepository extends CrudRepository<Title, Integer> {
    public List<Title> findByName(String name);

}
