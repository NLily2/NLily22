import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    String wordFirst = "do";
    String wordSecond = "cannot";

    System.out.println(quoteSwap(list, wordFirst, wordSecond));

  }

  public static String quoteSwap (ArrayList list, String word1, String word2) {

    int integer1 = list.indexOf(word1);
    int integer2 = list.indexOf(word2);

    list.set(integer1, word2);
    list.set(integer2, word1);

    String words = "";
    for (int i = 0; i < list.size(); i++) {
      words = words + " " + (String)list.get(i);
    }
    //System.out.println(words);

    return words;
  }
}
