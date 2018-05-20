import java.util.Scanner;
public class AverageOfInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the first integer: ");
    int input1 =scanner.nextInt();
    System.out.println("Please enter the second integer: ");
    int input2 =scanner.nextInt();
    System.out.println("Please enter the third integer: ");
    int input3 =scanner.nextInt();
    System.out.println("Please enter the fourth integer: ");
    int input4 =scanner.nextInt();
    System.out.println("Please enter the fifth integer: ");
    int input5 =scanner.nextInt();

    int sum = input1 + input2 + input3 + input4 + input5;
    int average = sum / 5;
    System.out.println("The sum of these numbers is: " + sum);
    System.out.println("The average of these numbers is: " + average);

  }
}