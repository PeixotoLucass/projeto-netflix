package com.projetonetflix.projetonetflix.helper;

import com.projetonetflix.projetonetflix.model.entity.Director;
import java.util.ArrayList;
import java.util.List;

public class DirectorHelper {

  public static List<Director> getListOfDirector() {
    Director director = new Director("Mandu", 33);
    List<Director> directors = new ArrayList<>();
    directors.add(director);
    return directors;
  }

}
