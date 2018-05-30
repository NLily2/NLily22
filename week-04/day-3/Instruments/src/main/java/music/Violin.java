package main.java.music;

public class Violin extends StringedInstrument{

  public Violin (){
    this.name = "Violin";
    this.numberOfStrings = 4;
  }

  @Override
  public String sound() {
    String sound = "Screech";
    return sound;
  }
}
