import java.util.ArrayList;

public class Sum {

  public ArrayList<Integer> listIntegers = new ArrayList<>();

  public void addNewItem(int newItem1){
    listIntegers.add(newItem1);
  }

  public ArrayList<Integer> getList(){
    return listIntegers;
  }

  public int returnSum(ArrayList<Integer>listIntegers) {
    int sum = 0;
    for (int i = 0; i < listIntegers.size(); i++) {
      sum = sum + listIntegers.get(i);
    }
    return sum;
  }
}

