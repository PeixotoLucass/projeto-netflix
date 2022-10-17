package com.projetonetflix.projetonetflix.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.projetonetflix.projetonetflix.dto.AllDTO;
import com.projetonetflix.projetonetflix.helper.ActorHelper;
import com.projetonetflix.projetonetflix.helper.DirectorHelper;
import com.projetonetflix.projetonetflix.helper.TitleHelper;
import com.projetonetflix.projetonetflix.model.entity.Actor;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.entity.Title;
import com.projetonetflix.projetonetflix.service.ActorService;
import com.projetonetflix.projetonetflix.service.DirectorService;
import com.projetonetflix.projetonetflix.service.TitleService;
import java.util.List;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
class FindAllControllerTest {

  public static final String ACTOR = "Mandu";
  public static final String DIRECTOR = "Mandu";
  public static final String TITLE = "Poderoso Mandu";
  public static final String ALL = "Mandu";

  @InjectMocks
  FindAllController findAllController;

  @Mock
  TitleService titleService;

  @Mock
  DirectorService directorService;

  @Mock
  ActorService actorService;

  @Test
  void ShouldReturnAllInDatabaseWhenUseGetByParam() {

    List<Title> titles = TitleHelper.getListOfTitle();
    List<Director> directors = DirectorHelper.getListOfDirector();
    List<Actor> actors = ActorHelper.getListOfActors2();

    Mockito.when(titleService.findByNameContainingIgnoreCase(TITLE))
        .thenReturn(titles);
    Mockito.when(directorService.findByNameContainingIgnoreCase(DIRECTOR))
        .thenReturn(directors);
    Mockito.when(actorService.findByNameContainingIgnoreCase(ACTOR))
        .thenReturn(actors);

    AllDTO allDTO = findAllController.getByParam(TITLE, ACTOR, DIRECTOR);

    assertNotNull(allDTO);
    assertEquals(allDTO.getTitles().get(0).getName(),
        titles.get(0).getName());
    assertEquals(allDTO.getTitles().get(0).getClassification(),
        titles.get(0).getClassification());
    assertEquals(allDTO.getTitles().get(0).getDateLaunch(),
        titles.get(0).getDateLaunch());
    assertEquals(allDTO.getTitles().get(0).getDuration(),
        titles.get(0).getDuration());

    assertEquals(allDTO.getDirectors().get(0).getName(),
        directors.get(0).getName());
    assertEquals(allDTO.getDirectors().get(0).getAge(),
        directors.get(0).getAge());

    assertEquals(allDTO.getActors().get(0).getName(),
        actors.get(0).getName());
    assertEquals(allDTO.getActors().get(0).getAge(),
        actors.get(0).getAge());

  }

  @Test
  void ShouldReturnAllInDatabaseWhenUseGetByAll() {

    List<Title> titles = TitleHelper.getListOfTitle();
    List<Director> directors = DirectorHelper.getListOfDirector();
    List<Actor> actors = ActorHelper.getListOfActors2();

    Mockito.when(titleService.findByNameContainingIgnoreCase(ALL))
        .thenReturn(titles);
    Mockito.when(directorService.findByNameContainingIgnoreCase(ALL))
        .thenReturn(directors);
    Mockito.when(actorService.findByNameContainingIgnoreCase(ALL))
        .thenReturn(actors);

    AllDTO allDTO = findAllController.getByAll(ALL);

    assertNotNull(allDTO);
    assertEquals(allDTO.getTitles().get(0).getName(),
        titles.get(0).getName());
    assertEquals(allDTO.getTitles().get(0).getClassification(),
        titles.get(0).getClassification());
    assertEquals(allDTO.getTitles().get(0).getDateLaunch(),
        titles.get(0).getDateLaunch());
    assertEquals(allDTO.getTitles().get(0).getDuration(),
        titles.get(0).getDuration());

    assertEquals(allDTO.getDirectors().get(0).getName(),
        directors.get(0).getName());
    assertEquals(allDTO.getDirectors().get(0).getAge(),
        directors.get(0).getAge());

    assertEquals(allDTO.getActors().get(0).getName(),
        actors.get(0).getName());
    assertEquals(allDTO.getActors().get(0).getAge(),
        actors.get(0).getAge());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseGetByAll() {

    List<Title> titles = TitleHelper.getListEmptyOfTitle();
    List<Director> directors = DirectorHelper.getListEmptyOfDirector();
    List<Actor> actors = ActorHelper.getListEmptyOfActor();

    Mockito.when(titleService.findByNameContainingIgnoreCase(TITLE))
        .thenReturn(titles);
    Mockito.when(directorService.findByNameContainingIgnoreCase(DIRECTOR))
        .thenReturn(directors);
    Mockito.when(actorService.findByNameContainingIgnoreCase(ACTOR))
        .thenReturn(actors);

    AllDTO allDTO = findAllController.getByParam(TITLE, ACTOR, DIRECTOR);

    assertNotNull(allDTO);
    assertEquals(allDTO.getTitles().isEmpty(), titles.isEmpty());
    assertEquals(allDTO.getDirectors().isEmpty(), directors.isEmpty());
    assertEquals(allDTO.getActors().isEmpty(), actors.isEmpty());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseGetByParam() {

    List<Title> titles = TitleHelper.getListEmptyOfTitle();
    List<Director> directors = DirectorHelper.getListEmptyOfDirector();
    List<Actor> actors = ActorHelper.getListEmptyOfActor();

    Mockito.when(titleService.findByNameContainingIgnoreCase(ALL))
        .thenReturn(titles);
    Mockito.when(directorService.findByNameContainingIgnoreCase(ALL))
        .thenReturn(directors);
    Mockito.when(actorService.findByNameContainingIgnoreCase(ALL))
        .thenReturn(actors);

    AllDTO allDTO = findAllController.getByAll(ALL);

    assertNotNull(allDTO);
    assertEquals(allDTO.getTitles().isEmpty(), titles.isEmpty());
    assertEquals(allDTO.getDirectors().isEmpty(), directors.isEmpty());
    assertEquals(allDTO.getActors().isEmpty(), actors.isEmpty());

  }

}