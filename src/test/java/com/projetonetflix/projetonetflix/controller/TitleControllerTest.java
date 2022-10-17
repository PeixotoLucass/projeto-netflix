package com.projetonetflix.projetonetflix.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.projetonetflix.projetonetflix.dto.TitleDTO;
import com.projetonetflix.projetonetflix.helper.TitleHelper;
import com.projetonetflix.projetonetflix.model.entity.Title;
import com.projetonetflix.projetonetflix.service.TitleService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TitleControllerTest {

  public static final String NAME = "Poderoso Mandu";

  @InjectMocks
  TitleController titleController;

  @Mock
  TitleService titleService;

  @Test
  void ShouldReturnAllTitleInDatabaseWhenUseFindAll() {

    List<Title> titles = TitleHelper.getListOfTitle();

    Mockito.when(titleService.findAll())
        .thenReturn(titles);

    List<TitleDTO> titleDTOS = titleController.findAll();

    assertNotNull(titleDTOS);
    assertEquals(titleDTOS.get(0).getName(),
        titles.get(0).getName());
    assertEquals(titleDTOS.get(0).getClassification(),
        titles.get(0).getClassification());
    assertEquals(titleDTOS.get(0).getDateLaunch(),
        titles.get(0).getDateLaunch());
    assertEquals(titleDTOS.get(0).getDuration(),
        titles.get(0).getDuration());

  }

  @Test
  void ShouldReturnAllTitleInDatabaseWhenUseGetByNameContainingIgnoreCase() {

    List<Title> titles = TitleHelper.getListOfTitle();

    Mockito.when(titleService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(titles);

    List<TitleDTO> titleDTOS = titleController.getByNameContainingIgnoreCase(NAME);

    assertNotNull(titleDTOS);
    assertEquals(titleDTOS.get(0).getName(),
        titles.get(0).getName());
    assertEquals(titleDTOS.get(0).getClassification(),
        titles.get(0).getClassification());
    assertEquals(titleDTOS.get(0).getDateLaunch(),
        titles.get(0).getDateLaunch());
    assertEquals(titleDTOS.get(0).getDuration(),
        titles.get(0).getDuration());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseFindAll() {

    List<Title> titles = TitleHelper.getListEmptyOfTitle();

    Mockito.when(titleService.findAll())
        .thenReturn(titles);

    List<TitleDTO> titleDTOS = titleController.findAll();

    assertNotNull(titleDTOS);
    assertEquals(titleDTOS.isEmpty(), titles.isEmpty());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseGetByNameContainingIgnoreCase() {

    List<Title> titles = TitleHelper.getListEmptyOfTitle();

    Mockito.when(titleService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(titles);

    List<TitleDTO> titleDTOS = titleController.getByNameContainingIgnoreCase(NAME);

    assertNotNull(titleDTOS);
    assertEquals(titleDTOS.isEmpty(), titles.isEmpty());

  }

}