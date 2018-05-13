import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Please enter the first number: ");
        int userInput1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int userInput2 = scanner.nextInt();
        System.out.print("Please enter the third number: ");
        int userInput3 = scanner.nextInt();
        System.out.print("Please enter the fourth number: ");
        int userInput4 = scanner.nextInt();
        System.out.print("Please enter the fifth number: ");
        int userInput5 = scanner.nextInt();

        int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        double average = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5;
        System.out.println("The sum of these numbers is: " + sum);
        System.out.println("The average of these numbers is: " + average);

    }
}
