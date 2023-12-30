package Recursion;

public class removeDuplicate {

  static String solve(String s) {
    if (s.length() <= 1)
      return s;

    if (s.charAt(0) == s.charAt(1))
      return solve(s.substring(1));
    else {
      String str = solve(s.substring(1));
      return s.charAt(0) + str;
    }
  }

  public static void main(String[] args) {
    String s = solve("aaaacccxxx");
    System.out.println(s);
  }
}
