public class Superman implements CanFly, CanRun, CanSwim {
  @Override
  public void fly() {
    CanFly.super.fly();//тут я специально оставил чтоб работал и дефолт и оверрайд
    System.out.println("Superman can fly");
  }

  @Override
  public void run() {
    //CanRun.super.run();
    System.out.println("Superman can run");
  }

  @Override
  public void swim() {
    //CanSwim.super.swim();
    System.out.println("Superman can swim");
  }
}
