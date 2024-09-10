Here are some commonly used methods of `StringBuilder` in Java:

1. **`append(String str)`**: Appends the specified string to this character sequence.
   ```java
   StringBuilder sb = new StringBuilder("Hello");
   sb.append(" World"); // "Hello World"
   ```

2. **`insert(int offset, String str)`**: Inserts the specified string at the specified position.
   ```java
   sb.insert(5, ","); // "Hello, World"
   ```

3. **`delete(int start, int end)`**: Removes the characters in a substring of this sequence.
   ```java
   sb.delete(5, 6); // "Hello World"
   ```

4. **`deleteCharAt(int index)`**: Removes the character at the specified position.
   ```java
   sb.deleteCharAt(5); // "HelloWorld"
   ```

5. **`replace(int start, int end, String str)`**: Replaces the characters in a substring with the specified string.
   ```java
   sb.replace(5, 10, " Everyone"); // "Hello Everyone"
   ```

6. **`reverse()`**: Reverses the sequence of characters.
   ```java
   sb.reverse(); // "enoyrevE olleH"
   ```

7. **`substring(int start)`**: Returns a new string that contains the characters of this sequence between the specified start and end.
   ```java
   String sub = sb.substring(0, 5); // "Hello"
   ```

8. **`charAt(int index)`**: Returns the character at the specified index.
   ```java
   char ch = sb.charAt(1); // 'e'
   ```

9. **`setCharAt(int index, char ch)`**: Sets the character at the specified index to the specified character.
   ```java
   sb.setCharAt(0, 'h'); // "hello"
   ```

10. **`length()`**: Returns the length of the character sequence.
	```java
	int len = sb.length(); // 11
	```

11. **`capacity()`**: Returns the current capacity of the `StringBuilder`.
	```java
	int cap = sb.capacity(); // Initial capacity or greater if expanded
	```

12. **`ensureCapacity(int minimumCapacity)`**: Ensures that the capacity is at least equal to the specified minimum.
	```java
	sb.ensureCapacity(50);
	```

13. **`setLength(int newLength)`**: Sets the length of the character sequence. If the new length is greater, the new characters are filled with `\u0000`.
	```java
	sb.setLength(5); // "Hello"
	```

14. **`toString()`**: Converts the `StringBuilder` to a `String`.
	```java
	String str = sb.toString(); // "Hello"
	```

15. **`indexOf(String str)`**: Returns the index within this string of the first occurrence of the specified substring.
	```java
	int index = sb.indexOf("World"); // Returns starting index of "World"
	```

16. **`lastIndexOf(String str)`**: Returns the index within this string of the last occurrence of the specified substring.
	```java
	int lastIndex = sb.lastIndexOf("o"); // Returns last index of 'o'
	```

17. **`appendCodePoint(int codePoint)`**: Appends the string representation of the code point.
	```java
	sb.appendCodePoint(33); // Appends '!'
	```

18. **`codePointAt(int index)`**: Returns the Unicode code point at the specified index.
	```java
	int codePoint = sb.codePointAt(0); // Returns code point of 'H'
	```

These methods are used to efficiently manipulate strings when performance and memory management are important. Let me know if you need further explanations or examples for any specific method!