
// Length of the longest substring without repeating characters

// Example 1:
// Input: “ABCDEFGABEF”
// Output: 7
// Explanation: The longest substring without repeating characters are “ABCDEFG”, “BCDEFGA”, and “CDEFGAB” with lengths of 7

// O(n^3)

// O(n)/O(n)


import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public int getLengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> charSet = new HashSet<>();
		int right = 0, left = 0;
		int maxLength = 0;

		while (right < n) {
			if (!charSet.contains(s.charAt(right))) {
				charSet.add(s.charAt(right));
				maxLength = Math.max(maxLength, right - left + 1);
				right++;
			} else {
				charSet.remove(s.charAt(left));
				left++;
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String s = "bacadbedbfghaghi"; 
		LongestSubstring solution = new LongestSubstring(); 
		int result = solution.getLengthOfLongestSubstring(s);
		System.out.println("The length of the longest substring without repeating characters is: " + result);
	}
}
