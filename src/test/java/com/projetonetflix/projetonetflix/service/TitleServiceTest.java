package com.projetonetflix.projetonetflix.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.projetonetflix.projetonetflix.helper.TitleHelper;
import com.projetonetflix.projetonetflix.model.entity.Title;
import com.projetonetflix.projetonetflix.model.repository.TitleRepository;
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
class TitleServiceTest {

  @InjectMocks
  public TitleService titleService;

  @Mock
  public TitleRepository titleRepository;

  public static final String NAME = "Poderoso Mandu";

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void ShouldReturnAllTitleInDatabaseWhenUseFindAll() {

    List<Title> titles = TitleHelper.getListOfTitle();

    Mockito.when(titleRepository.findAll()).thenReturn(titles);
    List<Title> titleListFromService = titleService.findAll();

    assertNotNull(titleListFromService);

    assertEquals(titleListFromService.get(0).getName(),
        titles.get(0).getName());
    assertEquals(titleListFromService.get(0).getClassification(),
        titles.get(0).getClassification());
    assertEquals(titleListFromService.get(0).getDateLaunch(),
        titles.get(0).getDateLaunch());
    assertEquals(titleListFromService.get(0).getDuration(),
        titles.get(0).getDuration());
  }

  @Test
  void ShouldReturnTitleInDatabaseWhenUseFindByNameContainingIgnoreCase() {

    List<Title> titles = TitleHelper.getListOfTitle();

    Mockito.when(titleRepository.findByNameContainingIgnoreCase(Mockito.anyString()))
        .thenReturn(titles);
    List<Title> titleListFromService = titleService.findByNameContainingIgnoreCase(NAME);

    assertNotNull(titleListFromService);

    assertEquals(titleListFromService.get(0).getName(),
        titles.get(0).getName());
    assertEquals(titleListFromService.get(0).getClassification(),
        titles.get(0).getClassification());
    assertEquals(titleListFromService.get(0).getDateLaunch(),
        titles.get(0).getDateLaunch());
    assertEquals(titleListFromService.get(0).getDuration(),
        titles.get(0).getDuration());
  }

}