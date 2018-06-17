import org.junit.Test;

import static org.junit.Assert.*;



public class TrickyAverageTest {

  @Test
  public void getTrickyAvg_testCase1() {
    int[] inputArray = {3, 4, 5, 6};
    double expectedResult = 4.5;
    double result = TrickyAverage.getTrickyAvg(inputArray);
    boolean checkResult = result == expectedResult;

    assertTrue(checkResult);
  }

  @Test
  public void getTrickyAvg_testCase2() {
    int[] inputArray = {5, 2, 8, -1};
    double expectedResult = 3.5;
    double result = TrickyAverage.getTrickyAvg(inputArray);
    boolean checkResult = result == expectedResult;

    assertTrue(checkResult);
  }

  @Test
  public void getTrickyAvg_testCase3() {
    int[] inputArray = {};
    double expectedResult = 0;
    double result = TrickyAverage.getTrickyAvg(inputArray);
    boolean checkResult = result == expectedResult;

    assertTrue(checkResult);
  }

  @Test
  public void getTrickyAvg_testCase4() {
    int[] inputArray = {5};
    double expectedResult = 5;
    double result = TrickyAverage.getTrickyAvg(inputArray);
    boolean checkResult = result == expectedResult;

    assertTrue(checkResult);
  }
}


/* [3, 4, 5, 6] -> should return 4.5
 * [5, 2, 8, -1] -> should return 3.5
 */