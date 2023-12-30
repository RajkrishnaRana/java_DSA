
import java.util.Scanner;

public class practice {

  public static int getPalindromeScore(String s) {
    int score = 0;
    int n = s.length();

    for (int i = 0; i < n; i++) {
      // Check for palindromes of length 4
      if (i + 3 < n) {
        if (s.charAt(i) == s.charAt(i + 3) && s.charAt(i + 1) == s.charAt(i + 2)) {
          score += 5;
        }
      }

      // Check for palindromes of length 5
      if (i + 4 < n) {
        if (s.charAt(i) == s.charAt(i + 4) && s.charAt(i + 1) == s.charAt(i + 3)) {
          score += 10;
        }
      }
    }

    return score;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.next();

    int score = getPalindromeScore(input);
    System.out.println("The score of the string is: " + score);

    scanner.close();
  }

}
