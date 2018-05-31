import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void returnSum() {
    Sum list = new Sum();
    int newItem1 = 10;
    int newItem2 = 15;
    int newItem3 = 20;
    list.addNewItem(newItem1);
    list.addNewItem(newItem2);
    list.addNewItem(newItem3);

    int actual = list.returnSum(list.getList());
    int expectedResult = newItem1 + newItem2 + newItem3;
    assertEquals(expectedResult, actual);
  }
}