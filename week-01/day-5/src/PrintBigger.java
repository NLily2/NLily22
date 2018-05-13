import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num1 = scanner.nextInt();

        if (num > num1) {
            System.out.println(num + " is the bigger number.");
        }
        else if (num1 > num) {
            System.out.println(num1 + " is the bigger number.");
        }


    }
}