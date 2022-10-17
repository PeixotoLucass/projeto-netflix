package com.projetonetflix.projetonetflix.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.projetonetflix.projetonetflix.dto.GenreDTO;
import com.projetonetflix.projetonetflix.helper.GenreHelper;
import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.service.GenreService;
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
class GenreControllerTest {

  public static final String NAME = "DraMa";

  @InjectMocks
  GenreController genreController;

  @Mock
  GenreService genreService;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void ShouldReturnAllGenreInDatabaseWhenUseFindAll() {

    List<Genre> genres = GenreHelper.getListOfGenre();

    Mockito.when(genreService.findAll())
        .thenReturn(genres);

    List<GenreDTO> genreDTOS = genreController.getGenres();

    assertNotNull(genreDTOS);

    assertEquals(genreDTOS.get(0).getName(),
        genres.get(0).getName());

  }

  @Test
  void ShouldReturnAllGenreInDatabaseWhenUseGetByNameContainingIgnoreCase() {

    List<Genre> genres = GenreHelper.getListOfGenre();

    Mockito.when(genreService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(genres);

    List<GenreDTO> genreDTOS = genreController.getByNameContainingIgnoreCase(NAME);

    assertNotNull(genreDTOS);

    assertEquals(genreDTOS.get(0).getName(),
        genres.get(0).getName());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseFindAll() {

    List<Genre> genres = GenreHelper.getListEmptyOfGenre();

    Mockito.when(genreService.findAll())
        .thenReturn(genres);

    List<GenreDTO> genreDTOS = genreController.getGenres();

    assertNotNull(genreDTOS);
    assertEquals(genreDTOS.isEmpty(), genres.isEmpty());

  }

  @Test
  void ShouldReturnEmptyListInDatabaseWhenUseGetByNameContainingIgnoreCase() {

    List<Genre> genres = GenreHelper.getListEmptyOfGenre();

    Mockito.when(genreService.findByNameContainingIgnoreCase(NAME))
        .thenReturn(genres);

    List<GenreDTO> genreDTOS = genreController.getByNameContainingIgnoreCase(NAME);

    assertNotNull(genreDTOS);
    assertEquals(genreDTOS.isEmpty(), genres.isEmpty());

  }

}