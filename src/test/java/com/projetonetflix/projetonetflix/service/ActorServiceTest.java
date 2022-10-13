package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.helper.ActorHelper;
import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.repository.ActorRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
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

  private List<Actor> actors = new ArrayList<>();

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void whenFindAllReturnListActorInstance() {

    Mockito.when(actorRepository.findAll()).thenReturn(ActorHelper.getListOfActors());
    List<Actor> actorList = actorService.findAll();

    Assertions.assertNotNull(actorList);

    Assertions.assertEquals(actorList.get(0).getName(),
        ActorHelper.getListOfActors().get(0).getName());

    Assertions.assertEquals(actorList.get(0).getAge(),
        ActorHelper.getListOfActors().get(0).getAge());
  }

  @Test
  void whenFindByNameIgnoreCaseReturnListActor() {

    Mockito.when(actorRepository.findByNameIgnoreCase(Mockito.anyString()))
        .thenReturn(ActorHelper.getListOfActors());
    List<Actor> actorList = this.actorService.findByNameIgnoreCase(NAME);

    Assertions.assertNotNull(actorList);

    Assertions.assertEquals(actorList.get(0).getName(),
        ActorHelper.getListOfActors().get(0).getName());

    Assertions.assertEquals(actorList.get(0).getAge(),
        ActorHelper.getListOfActors().get(0).getAge());
  }

  @Test
  void whenFindByNameContainingIgnoreCaseReturnListActor() {

    Mockito.when(actorRepository.findByNameContainingIgnoreCase(Mockito.anyString()))
        .thenReturn(ActorHelper.getListOfActors());
    List<Actor> actorList = this.actorService.findByNameContainingIgnoreCase(NAME);

    Assertions.assertNotNull(actorList);

    Assertions.assertEquals(actorList.get(0).getName(),
        ActorHelper.getListOfActors().get(0).getName());

    Assertions.assertEquals(actorList.get(0).getAge(),
        ActorHelper.getListOfActors().get(0).getAge());
  }

}


