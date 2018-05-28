import java.util.ArrayList;
public class Fleet {
  private ArrayList<Thing> thingsList;

  public Fleet() {
    thingsList = new ArrayList<>();
  }

  public void add(Thing thing) {
    thingsList.add(thing);
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < thingsList.size(); i++) {
      result += (i+1) + ". " + thingsList.get(i) + "\n";
    }
    return result;
  }
}