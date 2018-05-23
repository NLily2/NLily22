import java.awt.*;

public class PostItObjects {
  public static void main(String[] args) {

    PostItAttributes first = new PostItAttributes();
   first.backgroundColor = Color.orange;
   first.text = "Idea 1";
   first.textColor = Color.blue;

   PostItAttributes second = new PostItAttributes();
   second.backgroundColor = Color.pink;
   second.text = "Awesome";
   second.textColor = Color.black;

   PostItAttributes third = new PostItAttributes();
   third.backgroundColor = Color.yellow;
   third.text = "Superb!";
   third.textColor = Color.green;

  }
}

