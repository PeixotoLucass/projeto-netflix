package com.projetonetflix.projetonetflix.helper;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import java.util.ArrayList;
import java.util.List;

public class ActorHelper {

  public static List<Actor> getListOfActors() {
    Actor actor = new Actor(null, "Lucas", 25, new ArrayList<>());
    List<Actor> actors = new ArrayList<>();
    actors.add(actor);
    return actors;
  }

  public static List<Actor> getListOfActors2() {
    Actor actor = new Actor(null, "Mandu", 33, new ArrayList<>());
    List<Actor> actors = new ArrayList<>();
    actors.add(actor);
    return actors;
  }

}
