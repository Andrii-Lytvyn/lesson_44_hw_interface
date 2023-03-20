public interface CanRun {
  default void run() {
    System.out.println("I can run");
  }
}
