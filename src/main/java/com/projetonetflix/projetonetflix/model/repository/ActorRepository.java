package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> {
}
