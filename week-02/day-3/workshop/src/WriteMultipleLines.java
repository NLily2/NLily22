import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteMultipleLines {
  public static void main(String[] args) {

    String path = "my-file.txt";
    String word = "apple";
    int number = 5;

    extraParameters(path, word, number);
  }
  public static void extraParameters(String path, String word, int number) {
      Path filePath = Paths.get(path);
    try {
      ArrayList<String> content = new ArrayList<>();

      for (int i = 0; i < number; i++) {
        content.add(word);
      }
      Files.write(filePath, content);
    } catch (IOException e) {
    }
  }
}
