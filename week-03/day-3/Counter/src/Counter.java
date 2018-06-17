public class Counter {

  int value;
  int originalValue;

  public Counter() {
    value = 0;
  }

  public Counter(int value){
    this.value = value;
    this.originalValue = value;
  }

  public void add(int number) {
    value += number;
  }

  public void add() {
    value++;
  }

  public int get() {
    return value;
  }

  public void reset() {
    value = originalValue;
  }
}
