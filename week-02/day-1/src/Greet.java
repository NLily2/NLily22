public class Greet {
    public static void main(String[] args) {
        String al = "Greenfox";
        String welcome = greet(al);
        System.out.println(welcome);

    }
        public static String greet (String input) {
            String greeting = "Greeting dear, " + input + "!";
            return greeting;
        }

}
