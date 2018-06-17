import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animals;
    int slots = 2;

    public Farm(int slots) {
      this.slots = slots;
    animals = new ArrayList<>();  //mindegy ez itt van vagy fent?
    }

    public Farm(){
      animals = new ArrayList<>();
    }


    public List breed(){
      if (slots < animals.size()) {
        Animal animal = new Animal();
        animals.add(animal);
      }
      return animals;
    }

    public List slaughter(){
      Animal temp = animals.get(0);
      for (int i = 1; i < animals.size(); i++){
        if (animals.get(i).hunger < temp.hunger){
          temp = animals.get(i);
        }
      }
     boolean state = animals.remove(temp);
      return animals;
    }

  @Override
  public String toString() {
    return "Animals in this farm: " + animals;
  }
}
