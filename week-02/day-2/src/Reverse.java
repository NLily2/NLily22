public class Reverse {
  public static void main(String... args) {

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(reverse(reversed));
  }

  public static String reverse (String input) {
    String ford =  "";
    int leng = input.length();
    for (int i = input.length() - 1; i >= 0; i--) {
      ford = ford + input.charAt(i);
    }
    return ford;
  }
}
