package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.add(12);
    pq.add(16);
    pq.add(67);
    pq.add(34);

    Iterator<Integer> itr = pq.iterator();
    while (itr.hasNext())
      System.out.print(itr.next() + " ");
    System.out.println();

    pq.remove();
    System.out.println(pq.peek());

    pq.remove();
    System.out.println(pq.peek());

  }
}
