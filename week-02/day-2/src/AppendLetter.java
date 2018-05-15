import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter{
  public static void main(String... args){

    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }
    public static ArrayList appendA (ArrayList list1) {
    for (int i = 0; i < list1.size(); i++) {
      list1.set(i, list1.get(i) + "a");
    }
      return list1;
  }
}

//String append = input + 'a';
//        return append;
// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"