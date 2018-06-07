import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class swearWords {
  public static void main(String[] args) {

    ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    System.out.println(familyFriendlizer("src/content.txt", offensiveWords));
  }

  public static List<String>readFileContent(String filePath) {
    List<String> fileRows = new ArrayList<>();
    try {
      fileRows = Files.readAllLines(Paths.get(filePath));
    } catch (IOException e) {
      System.out.println("Unable to read file.");
    }
    return fileRows;
  }

  public static int removeOffensiveWords(List<String> content, List<String> offensiveWords){
    int wordsNumber = 0;
    for (String row : content){
      for (String word : row.split(" ")){
        for (String badWord : offensiveWords){
          if(word.toLowerCase().contains(badWord)){
            //System.out.println(words);
            wordsNumber += 1;
            break;
          }
        }
        }
    }
    return  wordsNumber;
  }

  public static int familyFriendlizer(String fileName, List<String> text) {
  List<String> textRows = readFileContent(fileName);
  return removeOffensiveWords(textRows, text);
  }
}
