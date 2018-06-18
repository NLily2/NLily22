import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {
  public static void main(String[] args) {

    String example = "Let's find UpperCase Characters";

  }

  public static String getUppercaseCharacters (String word){
    String[] splittedString = word.split("");
     Arrays.stream(splittedString)
             .map(c -> c.charAt(0))
             .filter(c -> c.isUpperCase(c))


  }

}


//Write a Stream Expression to find the uppercase characters in a string!