package com.projetonetflix.projetonetflix.helper;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import java.util.ArrayList;
import java.util.List;

public class GenreHelper {

  public static List<Genre> getListOfGenre() {
    Genre genre = new Genre(null, "Drama", new ArrayList<>());
    List<Genre> genres = new ArrayList<>();
    genres.add(genre);
    return genres;
  }

  public static List<Genre> getListEmptyOfGenre() {
    List<Genre> genres = new ArrayList<>();
    return genres;
  }

}
