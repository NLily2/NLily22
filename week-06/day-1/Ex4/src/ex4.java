import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex4 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    System.out.println(getNumbersWithSquareVauleMoreThan20(numbers));

  }

  public static List<Integer> getNumbersWithSquareVauleMoreThan20(ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n * n > 20)
            .collect(Collectors.toList());
  }
}