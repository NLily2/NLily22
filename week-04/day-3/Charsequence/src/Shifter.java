public class Shifter implements CharSequence{

  String expression;
  int num;

  public Shifter(String expression, int num){
    this.expression = expression;
    this.num = num;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    if (num + index >= expression.length()) {
      index = index - expression.length();
    }
    return expression.charAt(num + index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}


/*
Create a Shifter class implementing this interface

    This charsequence can be set up with a string (that is to be shifted) and a number (which will tell how many to shift)
    Implement the methods so the returned results of them will be shifted

 */