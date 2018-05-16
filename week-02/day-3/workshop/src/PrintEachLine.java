import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {

    String fileName = "my-file.txt";

    try {
    Path filePath = Paths.get("my-file.txt");
      List<String>lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (IOException e){
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
