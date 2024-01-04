package CollectionFramework;

import java.util.HashMap;
import java.util.TreeMap;

public class hashMap {
  public static void main(String[] args) {
    HashMap<String, Integer> mp = new HashMap<>();

    // add the value
    mp.put("Ninja", 4);
    mp.put("Coding", 1);
    mp.put("Course", 3);

    System.out.println(mp);

    // get the value
    System.out.println(mp.get("Coding"));

    // key is present or not
    System.out.println(mp.containsKey("Ninja"));
    System.out.println(mp.containsKey("ninja"));

    // delete
    mp.remove("Coding");
    System.out.println(mp);

    // TreeMap
    TreeMap<Integer, String> tmp = new TreeMap<>((a, b) -> b - a);

    tmp.put(2, "Coding");
    tmp.put(1, "Hello");
    tmp.put(3, "Ninja");

    System.out.println(tmp);
  }
}
