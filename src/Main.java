public class Main {
  /*Задача 1
Напишите интерфейсы "Умеет летать" CanFly с методом fly(),"Умеет бегать" CanRun с методом run и
"умеет плавать" CanSwim с методом swim и реализуйте их в классе "Супермен" Superman.

Задача 2
Реализуйте соответствующие интерфейсы из предыдущей задачи в классах "Человек", "Утка", "Пингвин" и
 "Самолёт".
  */
  public static void main(String[] args) {
    Superman hero = new Superman();
    hero.fly();
    hero.swim();
    hero.run();
    System.out.println();
    Human human = new Human();
    human.fly();
    human.swim();
    human.run();
    System.out.println();
    Duck duck = new Duck();
    duck.fly();
    duck.swim();
    duck.run();
    System.out.println();
    Penguin penguin = new Penguin();
    penguin.fly();
    penguin.swim();
    penguin.run();
    System.out.println();
    Airplane airplane = new Airplane();
    airplane.fly();
    airplane.run();
    airplane.swim();
  }
}