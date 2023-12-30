package Recursion;

public class removePi {

  static String solve(String str) {
    if (str.length() <= 1)
      return str;

    if (str.charAt(0) == 'p' && str.charAt(1) == 'i')
      return "3.14" + solve(str.substring(2, str.length()));
    return str.charAt(0) + solve(str.substring(1, str.length()));
  }

  public static void main(String[] args) {
    String s = "pi";
    String ans = solve(s);
    System.out.println(ans);
  }
}
