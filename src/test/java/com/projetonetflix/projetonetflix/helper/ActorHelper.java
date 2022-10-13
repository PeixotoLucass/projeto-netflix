package com.projetonetflix.projetonetflix.helper;

import com.projetonetflix.projetonetflix.model.entity.Actor;
import java.util.ArrayList;
import java.util.List;

public class ActorHelper {

  public static List<Actor> getListOfActors() {
    Actor actor = new Actor("Lucas", 25);
    List<Actor> actors = new ArrayList<>();
    actors.add(actor);
    return actors;
  }

}
