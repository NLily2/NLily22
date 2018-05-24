public class NumberAdder {
  public static void main(String[] args) {

    System.out.println(AddNumber(10));
  }

  public static int AddNumber (int n) {
    System.out.println(n);
    if (n == 1) {
      return 1;
    } else {
      return n + AddNumber(n - 1);
    }
  }
}

// Write a recursive function that
// takes one parameter: n and adds numbers from 1 to n.