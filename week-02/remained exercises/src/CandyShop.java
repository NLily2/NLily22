import java.util.ArrayList;
public class CandyShop {
  public static void main(String... args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    System.out.println(sweets(arrayList));
  }

  public static ArrayList sweets (ArrayList list) {
    String Croissant = "Croissant";
    String iceCream = "Ice cream";

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(2)) {
        list.set(i, Croissant);
      } else if (list.get(i).equals(false)) {
        list.set(i, iceCream);
      }
    }
    return list;
  }
}
