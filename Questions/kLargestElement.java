package Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class kLargestElement {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 3, 5, 7, 2 };
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for (int i : arr) {
      pq.add(i);
    }

    int k = 2;
    while (k > 0) {
      System.out.print(pq.peek() + " ");
      pq.remove();
      k--;
    }
  }
}
