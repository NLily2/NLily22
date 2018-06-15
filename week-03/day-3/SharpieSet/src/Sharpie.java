public class Sharpie {

  String color;
  float width;
  float inkAmount;
  boolean usable;

  public Sharpie(String color, float width){
    this.color = color;
    this.width = width;
    inkAmount = 100;
    usable = true;
  }

  public Sharpie(String color, float width, float inkAmount){
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public float use(){
    inkAmount -= 50;
    return inkAmount;
  }
}