package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Title;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TitleRepository extends PagingAndSortingRepository<Title, Integer> {
}
