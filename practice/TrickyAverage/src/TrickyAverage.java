import java.lang.reflect.Array;

public class TrickyAverage {
  public static void main(String[] args) {

    int[] example = {1, 2, 3};
    System.out.println(getTrickyAvg(example));

  }

public static double getTrickyAvg (int[] array){
    if(array.length == 0){
      return 0;
    } else if (array.length == 1){
      return array[0];
    }
  double maxEven = array[0];
  double minOdd = array[0];
  for (int i = 0; i < array.length; i++){
    if (array[i] % 2 == 0 && array[i] > maxEven){
      maxEven = array[i];
    } if (array[i] % 2 != 0 && array[i] < minOdd){
      minOdd = array[i];
    }
  }
  double average = (maxEven + minOdd) / 2;
  return average;
  }
}

/* Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
        * and returns the average of the smallest odd and largest even.
        *  - use only basic control flow statements, like 'for', 'if', etc.
        *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
        *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)

 * Example cases:
 * [1, 2, 3] -> should return 1.5
 * [3, 4, 5, 6] -> should return 4.5
 * [5, 2, 8, -1] -> should return 3.5
 */