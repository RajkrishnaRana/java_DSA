function lengthOfLongestSubstringTwoDistinct(s) {
  if (s === null || s.length === 0) {
    return 0;
  }

  let maxLength = 0;
  let start = 0;
  const charIndex = new Map();

  for (let end = 0; end < s.length; end++) {
    const currentChar = s.charAt(end);
    charIndex.set(currentChar, end);

    if (charIndex.size > 2) {
      let minIndex = s.length;
      charIndex.forEach((index) => {
        minIndex = Math.min(minIndex, index);
      });
      start = minIndex + 1;
      charIndex.delete(s.charAt(minIndex));
    }

    maxLength = Math.max(maxLength, end - start + 1);
  }

  return maxLength;
}

// Test cases
const input1 = "eceba";
const input2 = "cdabbabbcde";

console.log(lengthOfLongestSubstringTwoDistinct(input1)); // Output: 3
console.log(lengthOfLongestSubstringTwoDistinct(input2)); // Output: 6
