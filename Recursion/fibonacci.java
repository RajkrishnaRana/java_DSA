package Recursion;

import java.util.Scanner;

class fibonacci {
  static int fibonacciNumber(int num) {
    // base condition
    if (num == 0)
      return 0;
    if (num == 1)
      return 1;

    int nth = fibonacciNumber(num - 2) + fibonacciNumber(num - 1);
    return nth;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int ans = fibonacciNumber(num);
    System.out.println(ans);
  }
}
