import java.util.HashMap;
import java.util.Map;

public class LongestSubstringTwoDistinct {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndex = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charIndex.put(currentChar, end);

            if (charIndex.size() > 2) {
                int minIndex = s.length();
                for (int index : charIndex.values()) {
                    minIndex = Math.min(minIndex, index);
                }
                start = minIndex + 1;
                charIndex.remove(s.charAt(minIndex));
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "eceba";
        String input2 = "cdabbabbcde";
        String input3 = "abbbbbaaaaccccdddddddd";

        System.out.println(lengthOfLongestSubstringTwoDistinct(input1)); // Output: 3
        System.out.println(lengthOfLongestSubstringTwoDistinct(input2)); // Output: 6
        System.out.println(lengthOfLongestSubstringTwoDistinct(input3)); // Output: 6
    }
}
