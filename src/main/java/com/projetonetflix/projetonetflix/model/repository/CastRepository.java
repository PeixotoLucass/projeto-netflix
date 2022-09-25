package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Cast;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CastRepository extends PagingAndSortingRepository<Cast, Integer> {
}
