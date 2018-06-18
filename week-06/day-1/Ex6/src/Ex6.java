import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Ex6 {
  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println(findCities(cities));
  }

  public static List<String> findCities(ArrayList<String> cities){

    return cities.stream()
            .filter(c -> c.startsWith("A") && c.endsWith("I"))
            .collect(Collectors.toList());
  }
}
