package com.projetonetflix.projetonetflix.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.projetonetflix.projetonetflix.dto.ActorDTO;
import com.projetonetflix.projetonetflix.helper.ActorHelper;
import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.service.ActorService;
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
class ActorControllerTest {

  public static final String NAME = "Lucas";

  @InjectMocks
  private ActorController actorController;

  @Mock
  private ActorService actorService;


  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void ShouldReturnAllActorInDatabaseWhenUseFindAll() {

    List<Actor> actors = ActorHelper.getListOfActors();

    Mockito.when(actorService.findAll())
        .thenReturn(actors);
    List<ActorDTO> actorDTOS = actorController.findAll();

    assertNotNull(actorDTOS);

    assertEquals(actorDTOS.get(0).getName(),
        actors.get(0).getName());

    assertEquals(actorDTOS.get(0).getAge(),
        actors.get(0).getAge());

  }

  @Test
  void ShouldReturnAllActorInDatabaseWhenUseGetByNameContainingIgnoreCase() {

    List<Actor> actors = ActorHelper.getListOfActors();

    Mockito.when(actorService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(actors);
    List<ActorDTO> actorDTOS = actorController.getByNameContainingIgnoreCase(NAME);

    assertNotNull(actorDTOS);

    assertEquals(actorDTOS.get(0).getName(),
        actors.get(0).getName());

    assertEquals(actorDTOS.get(0).getAge(),
        actors.get(0).getAge());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseFindAll() {

    List<Actor> actors = ActorHelper.getListEmptyOfActor();

    Mockito.when(actorService.findAll())
        .thenReturn(actors);

    List<ActorDTO> actorDTOS = actorController.findAll();

    assertNotNull(actorDTOS);
    assertEquals(actorDTOS.isEmpty(), actors.isEmpty());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseGetByNameContainingIgnoreCase() {

    List<Actor> actors = ActorHelper.getListEmptyOfActor();

    Mockito.when(actorService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(actors);

    List<ActorDTO> actorDTOS = actorController.getByNameContainingIgnoreCase(NAME);

    assertNotNull(actorDTOS);
    assertEquals(actorDTOS.isEmpty(), actors.isEmpty());

  }

}