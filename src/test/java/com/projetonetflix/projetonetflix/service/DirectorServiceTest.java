package com.projetonetflix.projetonetflix.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.projetonetflix.projetonetflix.helper.DirectorHelper;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.repository.DirectorRepository;
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
class DirectorServiceTest {

  @InjectMocks
  DirectorService directorService;

  @Mock
  DirectorRepository directorRepository;

  public static final String NAME = "Mandu";

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void ShouldReturnAllDirectorInDatabaseWhenUseFindAll() {

    List<Director> directors = DirectorHelper.getListOfDirector();

    Mockito.when(directorRepository.findAll()).thenReturn(directors);
    List<Director> directorList = directorService.findAll();

    assertNotNull(directorList);

    assertEquals(directorList.get(0).getName(),
        directors.get(0).getName());

    assertEquals(directorList.get(0).getAge(),
        directors.get(0).getAge());
  }

  @Test
  void ShouldReturnDirectorInDatabaseWhenUseFindByNameContainingIgnoreCase() {

    List<Director> directors = DirectorHelper.getListOfDirector();

    Mockito.when(directorRepository.findByNameContainingIgnoreCase(Mockito.anyString()))
        .thenReturn(directors);
    List<Director> directorList = directorService.findByNameContainingIgnoreCase(NAME);

    assertNotNull(directorList);

    assertEquals(directorList.get(0).getName(),
        directors.get(0).getName());

    assertEquals(directorList.get(0).getAge(),
        directors.get(0).getAge());
  }

}