public class AppendAFunc {
    public static void main(String[] args) {

        String am = "kuty";
        String add = appendA (am);
        System.out.println(add);

    }

    public static String appendA (String input) {
        String append = input + 'a';
        return append;
    }
}
