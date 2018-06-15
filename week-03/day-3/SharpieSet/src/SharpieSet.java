import java.util.ArrayList;
import java.util.List;
public class SharpieSet {

  ArrayList<Sharpie> sharpieSet = new ArrayList<>();

  public void addToList(Sharpie sharpie){
    sharpieSet.add(sharpie);
  }

  public int countUsable() {
    int usableSharpie = 0;
    for (int i = 0; i < sharpieSet.size(); i++) {
      if (sharpieSet.get(i).inkAmount <= 0) {
        sharpieSet.get(i).usable = false;
      } else {
        usableSharpie += 1;
      }
    }
    return usableSharpie;
  }

  public void removeTrash(){
    int removedSharpies = 0;
    for (int i = 0; i < sharpieSet.size(); i++){
      if(sharpieSet.get(i).usable == false){
        sharpieSet.remove(i);
        removedSharpies += 1;
      }
    }
    System.out.println("There are " + removedSharpies + " sharpies without ink.");
  }
}