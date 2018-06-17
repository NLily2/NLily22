package battle;

public class MarvelHero extends Hero {

  MarvelHero(String name, int motivationLevel) {
    super(name, motivationLevel);
  }

  MarvelHero(String name){
    super(name);
    motivation = 40;
  }

  @Override public void punch(Punchable other) {
    if (!(other instanceof MarvelHero)) {
      super.punch(other);
    }
  }
}
