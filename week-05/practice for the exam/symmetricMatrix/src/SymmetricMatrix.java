import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SymmetricMatrix {
  public static void main(String[] args) {

    int rows = 3;
    int columns = 3;
    ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();
    //ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
    //ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
    //ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();

    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 2, 2)));
    symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));

    System.out.println(isSymmetric(symmetricMatrix));
  }

    public static boolean isSymmetric(ArrayList<ArrayList<Integer>> symmetricMatrix) {
    int rows = 3;
    int columns = 3;
    boolean symmetric = true;
    if (rows != columns) {
      symmetric = false;
    } else {
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          if (symmetricMatrix.get(i).get(j) != symmetricMatrix.get(j).get(i)) {
            return false;
          }
        }
      }
    }
    return symmetric;
  }
}

