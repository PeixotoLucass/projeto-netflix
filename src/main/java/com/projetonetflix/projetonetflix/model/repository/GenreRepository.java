package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GenreRepository extends PagingAndSortingRepository<Genre, Integer> {
}
