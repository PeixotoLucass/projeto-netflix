package com.projetonetflix.projetonetflix.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.projetonetflix.projetonetflix.helper.ActorHelper;
import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.repository.ActorRepository;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ActorServiceTest {

  public static final String NAME = "Lucas";

  @InjectMocks
  private ActorService actorService;

  @Mock
  private ActorRepository actorRepository;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void ShouldReturnAllActorInDatabaseWhenUseFindAll() {

    List<Actor> actors = ActorHelper.getListOfActors();

    Mockito.when(actorRepository.findAll()).thenReturn(actors);
    List<Actor> actorList = actorService.findAll();

    assertNotNull(actorList);

    assertEquals(actorList.get(0).getName(),
        actors.get(0).getName());

    assertEquals(actorList.get(0).getAge(),
        actors.get(0).getAge());
  }

  @Test
  void ShouldReturnActorInDatabaseWhenUseFindByNameIgnoreCase() {

    List<Actor> actors = ActorHelper.getListOfActors();

    Mockito.when(actorRepository.findByNameIgnoreCase(Mockito.anyString()))
        .thenReturn(actors);
    List<Actor> actorList = actorService.findByNameIgnoreCase(NAME);

    assertNotNull(actorList);

    assertEquals(actorList.get(0).getName(),
        actors.get(0).getName());

    assertEquals(actorList.get(0).getAge(),
        actors.get(0).getAge());
  }

  @Test
  void ShouldReturnActorInDatabaseWhenUseFindByNameContainingIgnoreCase() {

    List<Actor> actors = ActorHelper.getListOfActors();

    Mockito.when(actorRepository.findByNameContainingIgnoreCase(Mockito.anyString()))
        .thenReturn(actors);
    List<Actor> actorList = actorService.findByNameContainingIgnoreCase(NAME);

    assertNotNull(actorList);

    assertEquals(actorList.get(0).getName(),
        actors.get(0).getName());

    assertEquals(actorList.get(0).getAge(),
        actors.get(0).getAge());
  }

}


