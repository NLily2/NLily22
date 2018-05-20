import java.util.Scanner;

public class palindromeBuilder {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

       /* System.out.println("Enter your words: ");
        String input = "madam szerda";//scanner.next();
        System.out.println(createPalindrome(input)); */
        String example = "Lili szerda";
        System.out.println(createPalindrome(example));

    }
public static String createPalindrome (String input) {
        String back = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            back = back + input.charAt(i);
        }
        String palindrome = "";
        palindrome = input + back;
        return palindrome;
    }
}


//Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.
