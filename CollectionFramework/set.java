package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class set {

  public static void main(String[] args) {
    HashSet<String> s = new HashSet<>();

    s.add("One");
    s.add("Two");
    s.add("Three");
    s.add("Two");

    System.out.println(s);

    Iterator<String> i = s.iterator();

    while (i.hasNext()) {
      System.out.print(i.next() + " ");
    }

    s.remove("Two");
    System.out.println(s);
  }
}