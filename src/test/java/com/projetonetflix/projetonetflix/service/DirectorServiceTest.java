package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.helper.DirectorHelper;
import com.projetonetflix.projetonetflix.model.entity.Director;
import com.projetonetflix.projetonetflix.model.repository.DirectorRepository;
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
  void findAllReturnDirectorInstance() {

    Mockito.when(directorRepository.findAll()).thenReturn(DirectorHelper.getListOfDirector());
    List<Director> directorList = directorService.findAll();

    Assertions.assertNotNull(directorList);

    Assertions.assertEquals(directorList.get(0).getName(),
        DirectorHelper.getListOfDirector().get(0).getName());

    Assertions.assertEquals(directorList.get(0).getAge(),
        DirectorHelper.getListOfDirector().get(0).getAge());
  }

  @Test
  void findByNameContainingIgnoreCaseReturnDirector() {

    Mockito.when(directorRepository.findByNameContainingIgnoreCase(Mockito.anyString()))
        .thenReturn(DirectorHelper.getListOfDirector());
    List<Director> directorList = directorService.findByNameContainingIgnoreCase(NAME);

    Assertions.assertNotNull(directorList);

    Assertions.assertEquals(directorList.get(0).getName(),
        DirectorHelper.getListOfDirector().get(0).getName());

    Assertions.assertEquals(directorList.get(0).getAge(),
        DirectorHelper.getListOfDirector().get(0).getAge());
  }

}