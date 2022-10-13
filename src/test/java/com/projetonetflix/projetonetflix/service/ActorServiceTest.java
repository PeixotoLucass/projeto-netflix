package com.projetonetflix.projetonetflix.service;

import static org.junit.jupiter.api.Assertions.*;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.repository.ActorRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActorServiceTest {

  @InjectMocks
  private ActorService actorService;

  @Mock
  private ActorRepository actorRepository;

  private Actor actor;

  private List<Actor> actors;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    startActor();
  }

  @Test
  void whenFindAllReturnActorInstance() {
    actors = (List<Actor>) this.actorService.findAll();

    Assertions.assertNotNull(actors);
  }

  @Test
  void findByNameIgnoreCase() {
    String name = "Lucas";
    actors = this.actorService.findByNameIgnoreCase(name);

    Assertions.assertNotNull(actors);
  }

  @Test
  void findByNameContainingIgnoreCase() {
    String name = "Lucas";
    actors = this.actorService.findByNameContainingIgnoreCase(name);

    Assertions.assertNotNull(actors);
  }

  private List<Actor> startActor(){
    actor = new Actor("Lucas",25);
    List<Actor> actors = new ArrayList<>();
    actors.add(actor);
    return actors;
  }
}