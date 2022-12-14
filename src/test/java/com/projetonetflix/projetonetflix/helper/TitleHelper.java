package com.projetonetflix.projetonetflix.helper;

import com.projetonetflix.projetonetflix.model.entity.Title;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TitleHelper {

  static LocalDate date = LocalDate.parse("1972-09-20");

  public static List<Title> getListOfTitle() {
    Title title = new Title("Poderoso Mandu", "12+", date, "1 h 25 min", new ArrayList<>());
    List<Title> titleList = new ArrayList<>();
    titleList.add(title);
    return titleList;
  }

  public static List<Title> getListEmptyOfTitle() {
    List<Title> titles = new ArrayList<>();
    return titles;
  }

}
