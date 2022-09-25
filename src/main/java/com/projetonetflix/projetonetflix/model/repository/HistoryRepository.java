package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.History;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HistoryRepository extends PagingAndSortingRepository<History, Integer> {
}
