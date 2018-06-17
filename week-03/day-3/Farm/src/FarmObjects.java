import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FarmObjects {
  public static void main(String[] args) {

    Animal horse = new Animal("horse");
    Animal rabbit = new Animal("rabbit");
    Animal polecat = new Animal("polecat");
    Animal giraffe = new Animal("giraffe");
    Animal bird = new Animal("bird");

    Farm listAnimals = new Farm();
    listAnimals.animals.add(horse);
    listAnimals.animals.add(rabbit);
    listAnimals.animals.add(polecat);
    listAnimals.animals.add(giraffe);
    listAnimals.animals.add(bird);
    System.out.println(listAnimals);

    bird.drink();
    giraffe.play();
    for (int i = 0; i < 3; i++) {
      rabbit.eat();
    }

    listAnimals.breed();
    listAnimals.slaughter();
    System.out.println(listAnimals);
  }
}
