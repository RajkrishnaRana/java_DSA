package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class arrayDeque {
  public static void main(String[] args) {
    Deque<Integer> dq = new ArrayDeque<>();

    dq.addFirst(5);
    dq.addFirst(6);

    dq.addLast(14);
    dq.addLast(65);

    System.out.print("first to last print -> ");
    for (Iterator<Integer> itr = dq.iterator(); itr.hasNext();) {
      System.out.print(itr.next());
      System.out.print(" ");
    }
    System.out.println();

    System.out.print("last to first print -> ");
    for (Iterator<Integer> itr = dq.descendingIterator(); itr.hasNext();) {
      System.out.print(itr.next());
      System.out.print(" ");
    }
    System.out.println();

    dq.removeFirst();
    dq.remove();

    System.out.print("first to last print -> ");
    for (Iterator<Integer> itr = dq.iterator(); itr.hasNext();) {
      System.out.print(itr.next());
      System.out.print(" ");
    }
    System.out.println();
  }
}
