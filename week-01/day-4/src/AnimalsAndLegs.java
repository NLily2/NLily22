import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of chickens: ");
        int userInput1 = scanner.nextInt();
        System.out.println("Please enter the number of pigs: ");
        int userInput2 = scanner.nextInt();

        int legs = (userInput1 + userInput2) * 4;
        System.out.println("Your animals have " + legs + " legs altogether.");

    }
}
