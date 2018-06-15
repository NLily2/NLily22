public class GardenApp {
  public static void main(String[] args) {

    Garden garden = new Garden();

    garden.getPlantsStatus();
    System.out.print("\n");
    garden.waterGarden(40);
    garden.getPlantsStatus();
    System.out.print("\n");
    garden.waterGarden(70);
    garden.getPlantsStatus();
  }
}
