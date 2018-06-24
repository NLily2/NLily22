import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ex10 {
  public static void main(String[] args) {

    List<Fox> foxes = Arrays.asList(
            new Fox("Chandler", "Fennec", "green"),
            new Fox("Robert", "Pallida", "red"),
            new Fox("Joey", "Pallida", "green"),
            new Fox("Stuart", "Swift", "orange"),
            new Fox("Bing", "Short-eared", "yellow"));

    findGreenFox(foxes);
    findGreenAndPallidaFox(foxes);
  }

  public static void findGreenFox(List<Fox> foxes){
     foxes.stream()
            .filter(fox -> fox.getColor().equals("green"))
            .map(Fox :: getName)
            .forEach(System.out::println);
  }

  public static void findGreenAndPallidaFox(List<Fox> foxes){
    foxes.stream()
            .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("Pallida"))
            .map(Fox :: getName)
            .forEach((System.out::println));
  }
}