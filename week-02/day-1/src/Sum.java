import java.util.Scanner;
public class Sum {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        int number = sum(input);
        System.out.println(number);

    }

    public static int sum (int input) {
        Scanner scanner = new Scanner(System.in);
        int Sum = 0;
        for (int i = 0; i <= input; i++) {
            Sum = Sum + i;
        }
        return Sum;
    }
}
 /*System.out.println("Enter a number: ");
         int num = scanner.nextInt();
         int average = 0;
         int sum = 0;


         for (int i = 0; i < num; i++) {
        int num1 = scanner.nextInt();
        sum = sum + num1; */