package com.projetonetflix.projetonetflix.model.repository;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends CrudRepository<Actor, Integer>{
    public List<Actor> findByName(String name);
    public List<Actor> findByNameIgnoreCase(String name);
}
