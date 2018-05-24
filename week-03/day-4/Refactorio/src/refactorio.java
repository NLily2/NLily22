public class refactorio {
  public static void main(String[] args) {

    System.out.println(factorial(4));

  }
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}

// Create a recursive function called `refactorio`
// that returns it's input's factorial