public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    String url1 = url.replace("bots", "odds");
    System.out.println(url1);

  }
}
