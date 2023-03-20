public class Human implements CanFly, CanRun, CanSwim {

  @Override
  public void fly() {
    System.out.println("People fly strictly downhill");
  }

  @Override
  public void run() {
    System.out.println("People like to run.");
  }

  @Override
  public void swim() {
    System.out.println("People like to swim");
  }
}
