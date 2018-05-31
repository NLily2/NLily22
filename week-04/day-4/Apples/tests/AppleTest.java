import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  Apple myObject = new Apple("apple");

  @Test
  public void getApple() {
    String expected = "apple";
    String result = myObject.getApple();

    assertEquals(expected, result);
  }
}