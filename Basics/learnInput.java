package Basics;
import java.util.Scanner;

//How to take input
//Here t sets up a try-with-resources block, which is a way to create a resource (in this case, a Scanner for reading input from the console) and automatically close it when the block is exited. This ensures that the resource (the Scanner) is properly closed when you're done using it.
public class learnInput {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter Your Number");
      int age = sc.nextInt();
      sc.nextLine();
      System.out.println("Your Number is " + age);
      System.out.println("Enter the string");
      String name = sc.nextLine();
      System.out.println(name);
    }
  }
}
