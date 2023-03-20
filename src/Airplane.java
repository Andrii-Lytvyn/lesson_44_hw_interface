public class Airplane implements CanFly, CanRun, CanSwim {
  @Override
  public void fly() {
    CanFly.super.fly();
  }

  @Override
  public void run() {
    System.out.println("Airplanes can't run");
  }

  @Override
  public void swim() {
    System.out.println("Airplanes can's swim");
  }
}
