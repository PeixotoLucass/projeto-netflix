package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Title;
import org.springframework.data.repository.CrudRepository;

public interface TitleRepository extends CrudRepository<Title, Integer> {
}
