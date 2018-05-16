import java.util.Scanner;
public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int divisor = scanner.nextInt();

    try {
      int result = divide(divisor);
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }

  public static int divide(int number) {
    if (number == 0) {
      throw new ArithmeticException("fail");
    }
    int num = 10 / number;
    return num;
  }
}
