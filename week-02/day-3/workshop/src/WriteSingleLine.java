import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {

    ArrayList<String>content = new ArrayList<>();
    content.add("Németh Lilla");

    try {
      Path filePath = Paths.get("my-file.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}

