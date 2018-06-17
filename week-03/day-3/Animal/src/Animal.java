public class Animal {

  int hunger;
  int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat() {
    hunger = hunger - 1;
    System.out.println("hunger: "+hunger);
  }

  public void drink() {
    thirst = thirst - 1;
  }

  public void play() {
    hunger = hunger + 1;
    thirst = thirst + 1;

    System.out.println("hunger: "+hunger);
  }
}