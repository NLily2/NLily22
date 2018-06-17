package battle;
public class DCHero extends Hero {

  DCHero(String name, int motivationLevel) {
    super(name, motivationLevel);
  }

  DCHero(String name){
    super(name);
    motivation = 45;
  }

  @Override
  public void punch(Punchable other) {
    if (!(other instanceof DCHero)) {
      super.punch(other);
    }
  }
}
