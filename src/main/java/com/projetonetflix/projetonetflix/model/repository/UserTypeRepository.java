package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.UserType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserTypeRepository extends PagingAndSortingRepository<UserType, Integer> {
}
