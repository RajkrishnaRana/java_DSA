package Recursion;

import java.util.Scanner;

public class sumOfArr {
  static int solve(int arr[], int index) {
    // base case
    if (index >= 5)
      return 0;

    int ans = arr[index] + solve(arr, index + 1);
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter the number of the array");

    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }

    int ans = solve(arr, 0);
    System.out.println(ans);
  }
}
