import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex3 {
  public static void main(String[] args) {

  ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getSquareOfPosNumbers(numbers));
}


    public static List<Integer> getSquareOfPosNumbers(ArrayList<Integer> numbers){
      return numbers.stream()
              .filter(n -> n >= 0)
              .map(n -> n * n)
              .collect(Collectors.toList());
    }
}

