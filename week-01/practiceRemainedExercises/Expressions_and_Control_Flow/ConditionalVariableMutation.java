import java.util.Scanner;
public class ConditionalVariableMutation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    double a = scanner.nextDouble();
    int out = 0;

    if (a % 2 == 0) {
      System.out.println(out + 1);
    }

    System.out.println("\nPlease enter a number: ");
    int b = scanner.nextInt();
    String out2 = "";
    if (10 << b < 20) {
      out2 = "sweet!";
      System.out.println(out2);
    } else if (b < 10) {
      out2 = "Less!";
      System.out.println(out2);
    } else if (b > 20) {
      out2 = "More!";
      System.out.println(out2);
    }

    System.out.println("\nEnter the number of credits: ");
    int credits = scanner.nextInt();
    System.out.println("Enter the values of bonus: ");
    boolean isBonus = scanner.nextBoolean();
    System.out.println("Enter the number of c: ");
    int c = scanner.nextInt();

    if (credits >= 50 && isBonus == false) {
      c = c  - 2;
      System.out.println(c);
    } else if (credits < 50 && isBonus == false) {
      c = c - 1;
      System.out.println(c);
    } else if (isBonus == true) {
      c = c;
      System.out.println(c);
    }

    System.out.println("\nEnter the time: ");
    int time = scanner.nextInt();
    System.out.println("Please enter number of d: ");
    int d = scanner.nextInt();
    String out3 = "";

    if ((d % 4) == 0 && 200 >= time) {
      out3 = "check";
      System.out.println(out3);
    } else if (time > 200) {
      out3 = "Time out";
      System.out.println(out3);
    } else {
      out3 = "Run, Forest, Run!";
      System.out.println(out3);
    }
  }
}
