package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersontRepository extends PagingAndSortingRepository<Person, Integer> {
}
