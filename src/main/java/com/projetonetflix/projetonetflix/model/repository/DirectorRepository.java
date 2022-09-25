package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Director;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DirectorRepository extends PagingAndSortingRepository<Director, Integer> {
}
