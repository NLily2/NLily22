import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class searchPalindrome2 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = "bab tej madam";
        System.out.println(searchPalindrome(words));

    }
    public static List searchPalindrome(String input) {

        List<String> list = new ArrayList<String>(Arrays.asList(input.split(" ")));

        for (int i = 0; i < list.size();i++)
        {
            if(list.get(i).length() < 3)
            {
                list.remove(i);
            }
            else
            {
                String word = list.get(i);
                for (int j = 0; j < word.length(); j++) {
                    if(word.charAt(j)!= word.charAt(word.length()-(1+j)))
                    {list.remove(i);break;}
                }
            }
        }
        return list;
    }
}
