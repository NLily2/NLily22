import java.util.*;
public class ElementFinder {
  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2,7, 7, 3, 4, 5));

    containsSeven(arrayList);

  }
  public static void containsSeven (ArrayList list) {
    if (list.contains(7)) {
      System.out.println("Hoorray!");
    } else {
      System.out.println("Noooooo");
    }
  }
}
