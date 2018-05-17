public class anagram {
    public static void main(String[] args) {

        System.out.println(anagram("tej", "jet"));
    }


    public static boolean anagram (String input1, String input2) {
        String back = "";
        for (int i = input1.length() - 1; i >= 0; i--) {
            back = back + input1.charAt(i);
        }
        if (back.equals(input2)) {
            boolean resulttrue = true;
            return resulttrue;
        } else {
            boolean resultfalse = false;
            return resultfalse;
        }
    }

}




//Create a function named is anagram following your current language's
// style guide. It should take two strings and return a boolean value
// depending on whether its an anagram or not.