import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class SumTest {

  @Test
  public void returnSumWithMultipleInputs() {
    Sum list = new Sum();
    int newItem1 = 10;
    int newItem2 = 15;
    int newItem3 = 20;
    list.addNewItem(newItem1);
    list.addNewItem(newItem2);
    list.addNewItem(newItem3);

    int expectedResult = newItem1 + newItem2 + newItem3;
    int actual = list.returnSum(list.getList());
    assertEquals(expectedResult, actual);
  }

  @Test
  public void returnSumWithOneInput() {
    Sum list = new Sum();
    int newItem = 5;
    list.addNewItem(newItem);

    int expectedResult = newItem + 0;
    int actual = list.returnSum(list.getList());

    assertEquals(expectedResult, actual);
  }

  @Test
  public void returnSumWithEmptyList() {
    Sum list = new Sum();

    int expectedResult = 0;
    int actual = list.returnSum(list.getList());
  }

  @Test
  public void returnSumWithNull() {
    Sum list = new Sum();

    int expectedResult = 0;
    int actual = list.returnSum(list.getList());

    assertEquals(expectedResult, actual);
  }
}