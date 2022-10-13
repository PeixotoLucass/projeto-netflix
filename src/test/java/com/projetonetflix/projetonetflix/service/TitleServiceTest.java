package com.projetonetflix.projetonetflix.service;

import com.projetonetflix.projetonetflix.helper.TitleHelper;
import com.projetonetflix.projetonetflix.model.entity.Title;
import com.projetonetflix.projetonetflix.model.repository.TitleRepository;
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
class TitleServiceTest {

  @InjectMocks
  public TitleService titleService;

  @Mock
  public TitleRepository titleRepository;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void findAll() {

    Mockito.when(titleRepository.findAll()).thenReturn(TitleHelper.getListOfTitle());
    List<Title> titleList = titleService.findAll();

    Assertions.assertNotNull(titleList);

    Assertions.assertEquals(titleList.get(0).getName(),
        TitleHelper.getListOfTitle().get(0).getName());
    Assertions.assertEquals(titleList.get(0).getClassification(),
        TitleHelper.getListOfTitle().get(0).getClassification());
    Assertions.assertEquals(titleList.get(0).getDateLaunch(),
        TitleHelper.getListOfTitle().get(0).getDateLaunch());
    Assertions.assertEquals(titleList.get(0).getDuration(),
        TitleHelper.getListOfTitle().get(0).getDuration());
  }

  @Test
  void findByNameContainingIgnoreCase() {
  }
}