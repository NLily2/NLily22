public class Bunny2 {
  public static void main(String[] args) {

    System.out.println(totalEars(10));

  }
  public static int totalEars (int n) {
    if (n == 0) {
      return 0;
    } else if (n % 2 == 0){
      return 3 + totalEars(n -1);
    } else {
      return 2 + totalEars(n - 1);
    }
  }
}