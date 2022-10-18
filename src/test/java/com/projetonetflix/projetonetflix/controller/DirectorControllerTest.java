package com.projetonetflix.projetonetflix.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.projetonetflix.projetonetflix.dto.DirectorDTO;
import com.projetonetflix.projetonetflix.helper.DirectorHelper;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.service.DirectorService;
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
class DirectorControllerTest {

  public static final String NAME = "Mandu";

  @InjectMocks
  DirectorController directorController;

  @Mock
  DirectorService directorService;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void ShouldReturnAllDirectorInDatabaseWhenUseFindAll() {

    List<Director> directors = DirectorHelper.getListOfDirector();

    Mockito.when(directorService.findAll())
        .thenReturn(directors);
    List<DirectorDTO> directorDTOS = directorController.getDirectors();

    assertNotNull(directorDTOS);

    assertEquals(directorDTOS.get(0).getName(),
        directors.get(0).getName());

    assertEquals(directorDTOS.get(0).getAge(),
        directors.get(0).getAge());

  }

  @Test
  void ShouldReturnAllDirectorInDatabaseWhenUseGetByNameContains() {

    List<Director> directors = DirectorHelper.getListOfDirector();

    Mockito.when(directorService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(directors);
    List<DirectorDTO> directorDTOS = directorController.getByNameContains(NAME);

    assertNotNull(directorDTOS);

    assertEquals(directorDTOS.get(0).getName(),
        directors.get(0).getName());

    assertEquals(directorDTOS.get(0).getAge(),
        directors.get(0).getAge());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseFindAll() {

    List<Director> directors = DirectorHelper.getListEmptyOfDirector();

    Mockito.when(directorService.findAll())
        .thenReturn(directors);

    List<DirectorDTO> directorDTOS = directorController.getDirectors();

    assertNotNull(directorDTOS);
    assertTrue(directorDTOS.isEmpty());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseGetByNameContains() {

    List<Director> directors = DirectorHelper.getListEmptyOfDirector();

    Mockito.when(directorService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(directors);

    List<DirectorDTO> directorDTOS = directorController.getByNameContains(NAME);

    assertNotNull(directorDTOS);
    assertTrue(directorDTOS.isEmpty());

  }

}