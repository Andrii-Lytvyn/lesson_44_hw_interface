public class Penguin implements CanFly, CanRun, CanSwim {
  @Override
  public void fly() {
    System.out.println("Penguin can't fly");
  }

  @Override
  public void swim() {
    System.out.println("Penguins are Gods of water");
  }

  @Override
  public void run() {
    System.out.println("Penguins can't run");
  }
}
