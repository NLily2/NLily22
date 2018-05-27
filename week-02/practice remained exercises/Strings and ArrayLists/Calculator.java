import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the operation: ");
      String operation = scanner.next();
    System.out.println("Please enter the first operand: ");
      int operand1 = scanner.nextInt();
    System.out.println("Please enter the second operand: ");
      int operand2 = scanner.nextInt();

    System.out.println(calculate(operation, operand1, operand2));
  }
  public static int calculate (String op, int num1, int num2) {
    int numResult = 0;
    if (op.equals("+")) {
      numResult = numResult + num1 + num2;
    } else if (op.equals("-")) {
      numResult = numResult + num1 - num2;
    } else if (op.equals("*")) {
      numResult = numResult + num1 * num2;
    } else if (op.equals("/")) {
      numResult = numResult + num1 / num2;
    } else if (op.equals("%")) {
      numResult = numResult + num1 % num2;
    }
    return numResult;
  }
}

