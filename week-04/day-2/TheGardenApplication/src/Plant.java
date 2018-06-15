public class Plant {

  String type;
  String color;
  double waterAmountNeeded;
  double waterStatus;
  double waterAbsorbed;

  public void getWaterStatus() {
    if (waterStatus < waterAmountNeeded) {
      System.out.println("The " + color + type + " needs water.");
    } else {
      System.out.println("The " + color + type + " doesn\'t need water.");
    }
  }




}

