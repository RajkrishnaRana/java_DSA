package CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class cmp implements Comparator<Integer> {
  public int compare(Integer a, Integer b) {
    return b - a;
  }
}

// String descending order comparator
class cmp2 implements Comparator<String> {
  public int compare(String a, String b) {
    return b.compareTo(a);
  }
}

public class treeSet {
  public static void main(String[] args) {
    // Treeset implement with self balancing binary tree like Red-Black Tree
    // It is take add, remove in O(log N) time
    // It is a sorted set
    // linked hash set is not sorted set

    TreeSet<Integer> ts = new TreeSet<>();

    ts.add(7);
    ts.add(5);
    ts.add(8);
    ts.add(5);

    // First & Last Element
    System.out.println("First element " + ts.first() + " Last element " + ts.last());

    // Higher & Lower element
    System.out.println("Higher element " + ts.higher(7) + " Lower element " + ts.lower(7));

    // delete element
    int a = ts.pollFirst();
    int b = ts.pollLast();
    ts.remove(7);

    System.out.println(ts);
    System.out.println(a + " " + b);

    // using comparator for descending order
    // TreeSet<Integer> ts2 = new TreeSet<>((a1, a2) -> a2 - a1); // inline
    // comparator
    TreeSet<Integer> ts2 = new TreeSet<>(new cmp()); // external comparator

    ts2.add(7);
    ts2.add(5);
    ts2.add(8);
    ts2.add(5);

    System.out.println(ts2);

    // TreeSet<String> ts3 = new TreeSet<>(new cmp2()); //external comparator
    TreeSet<String> ts3 = new TreeSet<>((s1, s2) -> s2.compareTo(s1)); // internal comparator

    ts3.add("One");
    ts3.add("Two");
    ts3.add("Four");
    System.out.println(ts3);
  }
}
