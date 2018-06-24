import java.util.Arrays;

public class Ex9 {
  public static void main(String[] args) {

    Character[] array = {'a', 'n', 'g', 'o', 'l', 'n', 'a'};
    System.out.println(convertCharArrayToString(array));

  }

  public static String convertCharArrayToString(Character[] array){
    return Arrays.stream(array)
            .map(c -> Character.toString(c))
            .reduce((x, y) -> x + y)
            .get();
  }
}
