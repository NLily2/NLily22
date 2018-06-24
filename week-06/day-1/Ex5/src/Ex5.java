import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex5 {
  public static void main(String[] args) {

    String textWithUppercaseLetters = "Let's find UpperCase Characters";
    System.out.println(getUppercaseCharacters(textWithUppercaseLetters));
  }

  public static String getUppercaseCharacters (String word){
    String[] splittedString = word.split("");
     return Arrays.stream(splittedString)
             .map(c -> c.charAt(0))
             .filter(c -> c.isUpperCase(c))
             .map(c -> c.toString(c))
             .reduce((x, y) -> x + y)
             .get();
  }
}
