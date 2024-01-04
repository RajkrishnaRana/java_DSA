package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(); // initialize the ArrayList
    ArrayList<Integer> list2 = new ArrayList<>(Collections.nCopies(10, 0)); // 10 0 value arraylist defined
    ArrayList<Integer> list3 = new ArrayList<>(100);

    list3.add(100);
    list2.add(1, 3);// adds value in index 1 and shift the after values on right

    int val = list2.get(1);

    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);
    System.out.println(val);

    list2.set(5, 5);// set element on an index
    System.out.println(list2);
    System.out.println(list2.contains(5));
    System.out.println(list2.contains(2));

    Collections.sort(list2); // sort algo
    System.out.println(list2);

    list2.remove(5);
    System.out.println(list2);

    list2.clear();
    System.out.println(list2);

  }
}
