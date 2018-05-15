import java.util.*;
public class Matchmaking {
  public static void main(String[] args) {

    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));


    System.out.println(makingMatches(girls, boys));

  }

  public static ArrayList makingMatches (ArrayList list1, ArrayList list2) {
    ArrayList <String> list3 = new ArrayList<>();

    for (int i = 0; i < list1.size(); i++) {

      list3.add(list1.get(i).toString());
      list3.add((String)list2.get(i));
      System.out.println(list3);
    }
    return list3;



   // public static ArrayList putSaturn (ArrayList input) {

  }
}

// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...
