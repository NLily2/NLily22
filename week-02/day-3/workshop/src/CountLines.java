import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the file name: ");
    String fileName = scanner.next();

    numberLines(fileName);
  }

  public static int numberLines(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      int line = lines.size();
      System.out.println(line);
      return line;
    } catch (IOException e1) {
      System.out.println(0);
      return(0);
    }
  }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
