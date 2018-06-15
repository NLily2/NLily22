import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plantInGarden;

  Flower flower1 = new Flower("yellow");
  Flower flower2 = new Flower("blue");
  Tree tree1 = new Tree("purple");
  Tree tree2 = new Tree("orange");

  public void addPlantsToGarden() {
    plantInGarden = new ArrayList<>();
    plantInGarden.add(flower1);
    plantInGarden.add(flower2);
    plantInGarden.add(tree1);
    plantInGarden.add(tree2);
  }

public void waterGarden(double waterUsedForWatering){
  System.out.println("Watering with " + waterUsedForWatering);
  int plantNeedWater = 0;
  Plant temp;
  for (int i = 0; i < plantInGarden.size(); i++){
    temp = plantInGarden.get(i);
    if(temp.waterStatus < temp.waterAmountNeeded){
      plantNeedWater += 1;
    }
  }
  waterUsedForWatering = waterUsedForWatering / plantNeedWater;
  for (int i = 0; i < plantInGarden.size(); i++){
    plantInGarden.get(i).getWatered(waterUsedForWatering);
  }
}

public void getPlantsStatus(){
    for(Plant plant : plantInGarden){
      plant.getWaterStatus();
    }
  }
}
