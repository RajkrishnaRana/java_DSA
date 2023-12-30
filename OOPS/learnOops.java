package OOPS;

abstract class Animal {
  abstract void walk();

  Animal() {
    System.out.println("You r creating a new Animal");
  }
}

class Horse extends Animal {
  public void walk() {
    System.out.println("It is walking on 4 legs");
  }
}

class Pen {
  String type;
  String color;

  public void printType() {
    System.out.println(this.type);
  }

  public void printColor() {
    System.out.println(this.color);
  }
}

class BallPen extends Pen {
  public void printing() {
    System.out.println(this.color);
  }
}

public class learnOops {
  public static void main(String args[]) {
    Pen pen1 = new Pen();
    Pen pen2 = new Pen();
    BallPen bpen = new BallPen();

    pen1.type = "ballPoint";
    pen1.color = "black";

    pen2.type = "Gel";
    pen2.color = "blue";

    pen1.printColor();
    pen2.printType();

    bpen.color = "green";
    bpen.printing();

    Horse h1 = new Horse();
    h1.walk();
  }
}
