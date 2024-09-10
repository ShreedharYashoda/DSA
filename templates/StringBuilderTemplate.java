public class StringBuilderTemplate {
	// O(n^2)
	public String appendNtimesUsingStringConcat(char c, int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			str += c; // O(s) where s = length(str)
		}
		return str;
	}

	// O(n)
	public String appendNtimesUsingStringBuilder(char c, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(c); // O(1)
		}
		return sb.toString();
	}

	// String is immutable, meaning you can't change it once created. When you
	// concatenate two strings, it doesn’t simply add one string at the end of
	// another; it creates a new string (ouch). Use a StringBuilder instead (or
	// string.join() on a list in Python), which essentially is a List<Character>.

	// · String += c → linear
	// · StringBuilder.append(c) → constant


	// 1119. Remove Vowels from a String
	// Good! O(n) where n = length(s)
	public String removeVowels(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			// equivalent to adding a character
			// at the end of a list. O(1)
			if (isVowel(c) == false)
				sb.append(c);
		}
		return sb.toString();
	}

	// Bad! O(n^2) where n = length(s)
	public String removeVowelsBad(String s) {
		String result = "";
		for (char c : s.toCharArray()) {
			// allocates a new string in memory
			// O(r) where r = length(result)
			if (isVowel(c) == false)
				result += c;
		}
		return result;
	}

	private boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i'
				|| c == 'o' || c == 'u';
	}
}

// https://leetcode.com/problems/remove-vowels-from-a-string/

// https://leetcode.com/problems/reverse-words-in-a-string/

// https://leetcode.com/problems/unique-email-addresses/

// https://leetcode.com/problems/repeated-dna-sequences/

// https://leetcode.com/problems/decode-string/

// https://leetcode.com/problems/custom-sort-string/

// https://leetcode.com/problems/add-strings/

// https://leetcode.com/problems/add-binary/

// https://leetcode.com/problems/largest-number/

// https://leetcode.com/problems/bold-words-in-string/

// https://leetcode.com/problems/add-bold-tag-in-string/

