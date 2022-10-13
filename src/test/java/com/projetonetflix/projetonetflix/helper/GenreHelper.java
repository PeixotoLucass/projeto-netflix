package com.projetonetflix.projetonetflix.helper;

import com.projetonetflix.projetonetflix.model.entity.Genre;
import java.util.ArrayList;
import java.util.List;

public class GenreHelper {

  public static List<Genre> getListOfGenre() {
    Genre genre = new Genre("Drama");
    List<Genre> genres = new ArrayList<>();
    genres.add(genre);
    return genres;
  }

}
