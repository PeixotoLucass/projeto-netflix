package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersontRepository extends CrudRepository<Person, Integer> {
}
