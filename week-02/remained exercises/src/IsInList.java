import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    checkNums(list);
  }

  public static ArrayList checkNums (ArrayList list) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    if (list.containsAll(numbers)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    return list;
  }
}