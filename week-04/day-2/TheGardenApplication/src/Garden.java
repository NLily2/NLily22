import java.util.ArrayList;

public class Garden {

  Flower flower1 = new Flower("yellow");
  Flower flower2 = new Flower("blue");
  Tree tree1 = new Tree("purple");
  Tree tree2 = new Tree("orange");

  public void addPlantsToGarden() {
    ArrayList<Plant> plantInGarden = new ArrayList<>();
    plantInGarden.add(flower1);
    plantInGarden.add(flower2);
    plantInGarden.add(tree1);
    plantInGarden.add(tree2);
    
  }
}
