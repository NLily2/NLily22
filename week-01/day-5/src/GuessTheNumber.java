import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 12;
        int input = 0;

        while (input != num) {
            System.out.println("Please guess the number: ");
            input = scanner.nextInt();
            if (input > num) {
                System.out.println("The stored number is lower.");
            } else if (input < num) {
                System.out.println("The stored number is higher.");
            } else {
                System.out.println("You found the number: " + num);
                break;
            }
        }
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8