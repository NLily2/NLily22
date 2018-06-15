import java.util.ArrayList;

public class Sharpie_app {
  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("red", 40);
    Sharpie sharpie2 = new Sharpie("green", 10);
    Sharpie sharpie3 = new Sharpie("grey", 60);
    Sharpie sharpie4 = new Sharpie("blue", 80, 30);

    SharpieSet sharpies = new SharpieSet();
    sharpies.addToList(sharpie1);
    sharpies.addToList(sharpie2);
    sharpies.addToList(sharpie3);
    sharpies.addToList(sharpie4);;

    System.out.println("There is " + sharpie1.inkAmount + " ink in the red sharpie.");
    sharpie1.use();
    System.out.println("After one usage there is " + sharpie1.inkAmount + " ink in the red sharpie.");

    System.out.println("There is " + sharpie3.inkAmount + " ink in the grey sharpie.");
    System.out.println(sharpie3.usable);

    System.out.println("There is " + sharpie4.inkAmount + " ink in the blue sharpie.");
    System.out.println("There is/are " + sharpies.countUsable() + " sharpies filled with ink.");
    sharpie4.use();
    System.out.println("After one usage there is " + sharpie4.inkAmount + "ink in the blue sharpie.");
    System.out.println("Now there is/are " + sharpies.countUsable() + " sharpies filled with ink.");

    sharpies.removeTrash();
  }
}