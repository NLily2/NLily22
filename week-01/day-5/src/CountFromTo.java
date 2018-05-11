import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int userInput2 = scanner.nextInt();

        if (userInput2 <= userInput1) {
            System.out.println("The second number should be bigger.");
            }
            else {
            while (userInput1 < userInput2 ) {
                System.out.println(userInput1);
                userInput1 = userInput1 + 1;
                }
            }
    }
}
