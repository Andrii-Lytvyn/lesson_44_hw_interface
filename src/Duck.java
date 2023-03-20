public class Duck implements CanFly, CanRun, CanSwim {
  @Override
  public void swim() {
    System.out.println("Ducks are Gods of water");
  }

  @Override
  public void run() {
    System.out.println("Ducks can't run");
  }

  @Override
  public void fly() {
    System.out.println("Ducks can fly");
  }
}
