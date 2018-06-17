public class Helicopter extends Vehicle implements Flyable{

  @Override
  public void land() {
    System.out.println("I can easily land even on small plots.");
  }

  @Override
  public void fly() {
    System.out.println("If the pilot is good then I can fly.");
  }

  @Override
  public void takeOff() {
    System.out.println("I can take off from anywhere anytime.");
  }
}
