import java.util.ArrayList;

public class Sum {

  public ArrayList<Integer> listIntegers = new ArrayList<>();

  public void addNewItem(int newItem){
    listIntegers.add(newItem);
  }

  public ArrayList<Integer> getList(){
    return listIntegers;
  }

  public int returnSum(ArrayList<Integer>listIntegers) {
    if (listIntegers == null) {
      return 0;
    }

    int sum = 0;
    for (int i = 0; i < listIntegers.size(); i++) {
      sum = sum + listIntegers.get(i);
    }
    return sum;
  }
}

