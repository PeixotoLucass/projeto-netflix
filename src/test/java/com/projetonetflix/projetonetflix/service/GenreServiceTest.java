package com.projetonetflix.projetonetflix.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.projetonetflix.projetonetflix.helper.GenreHelper;
import com.projetonetflix.projetonetflix.model.entity.Genre;
import com.projetonetflix.projetonetflix.model.repository.GenreRepository;
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
class GenreServiceTest {

  @InjectMocks
  public GenreService genreService;

  @Mock
  public GenreRepository genreRepository;

  public static final String NAME = "DraMa";

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void ShouldReturnAllGenreInDatabaseWhenUseFindAll() {

    List<Genre> genres = GenreHelper.getListOfGenre();

    Mockito.when(genreRepository.findAll()).thenReturn(genres);
    List<Genre> genreList = genreService.findAll();

    assertNotNull(genreList);

    assertEquals(genreList.get(0).getName(),
        genres.get(0).getName());
  }

  @Test
  void ShouldReturnGenreInDatabaseWhenUseFindByNameContainingIgnoreCase() {

    List<Genre> genres = GenreHelper.getListOfGenre();

    Mockito.when(genreRepository.findByNameContainingIgnoreCase(Mockito.anyString()))
        .thenReturn(genres);
    List<Genre> genreList = genreService.findByNameContainingIgnoreCase(NAME);

    assertNotNull(genreList);

    assertEquals(genreList.get(0).getName(),
        genres.get(0).getName());
  }

}