public class TodoPrint {
  public static void main(String[] args) {
    String todoText = "\n - Buy milk\n";
    String beginning = "My todo: ";
    String end = " - Download games\n";
    String indention = "\t - Diablo";

    String everything = beginning.concat(todoText).concat(end).concat(indention);
    System.out.println(everything);

  }
}
