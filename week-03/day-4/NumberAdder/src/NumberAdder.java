public class NumberAdder {
  public static void main(String[] args) {

    System.out.println(AddNumber(10));
  }

  public static int AddNumber (int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + AddNumber(n - 1);
    }
  }
}
