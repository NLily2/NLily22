import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int k = 1;

        for (int i = 0; i < num; i++) {
            for (int s = (num -(i+1)); s > 0; s--){
                System.out.print(" ");
            }

            for (int c = 0; c < i+k; c++) {
              System.out.print("*");
            }
            System.out.print("\n");
            k++;



        }
    }
}



// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was