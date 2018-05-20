import java.util.Scanner;
public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the first number: ");
    int input1 = scanner.nextInt();
    System.out.println("Please enter the second number: ");
    int input2 = scanner.nextInt();

    if (input1 > input2) {
      System.out.println(input1 + " is bigger than " + input2 + ".");
    } else {
      System.out.println(input2 + " is bigger than " + input1 + ".");
    }
  }
}
