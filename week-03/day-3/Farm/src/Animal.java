public class Animal {

  int hunger;
  int thirst;
  String name;

  public Animal(String name) {
    this.name = name;
    hunger = 50;
    thirst = 50;
  }

  public Animal() {
    this.name = "dog";
    hunger = 50;
    thirst = 50;
  }

  public int eat() {
    hunger = hunger - 1;
    return hunger;
  }

  public int drink() {
    thirst -= 1;
    return thirst;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  @Override
  public String toString() {
    return name;
  }
}
