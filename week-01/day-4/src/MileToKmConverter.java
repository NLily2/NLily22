import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilometers: ");
        int Kilometer = scanner.nextInt();
        float Miles = (float) (Kilometer * 0.6);

        System.out.println("This is " + Miles + " miles.");

        // Write a program that asks for an integer that is a distance in kilometers,
// then it converts that value to miles and prints it

    }
}
