public class SumDigit {
  public static void main(String[] args) {

    System.out.println(SumDigit(412));
  }
public static int SumDigit (int n) {
    if (n == 0) {
    return 0;
    } else {
    return n % 10 + SumDigit(n / 10);
    }
  }
}

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).