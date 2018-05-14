import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int average = 0;
        int sum = 0;


        for (int i = 0; i < num; i++) {
            int num1 = scanner.nextInt();
            sum = sum + num1;
        }
        System.out.println(sum);
        average = sum / num;
        System.out.println(average);

    }
}


