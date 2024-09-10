Here are some commonly used methods for `String` in Java:

1. **`length()`**: Returns the length of the string.
   ```java
   String str = "Hello";
   int length = str.length(); // 5
   ```

2. **`charAt(int index)`**: Returns the character at the specified index.
   ```java
   char ch = str.charAt(1); // 'e'
   ```

3. **`substring(int beginIndex, int endIndex)`**: Returns a substring from the specified begin index to the end index.
   ```java
   String substr = str.substring(1, 4); // "ell"
   ```

4. **`toLowerCase()`** / **`toUpperCase()`**: Converts all characters to lower or upper case.
   ```java
   String lower = str.toLowerCase(); // "hello"
   String upper = str.toUpperCase(); // "HELLO"
   ```

5. **`indexOf(String str)`**: Returns the index of the first occurrence of the specified substring.
   ```java
   int index = str.indexOf("e"); // 1
   ```

6. **`lastIndexOf(String str)`**: Returns the index of the last occurrence of the specified substring.
   ```java
   int lastIndex = str.lastIndexOf("l"); // 3
   ```

7. **`trim()`**: Removes leading and trailing whitespace.
   ```java
   String trimmed = "  Hello  ".trim(); // "Hello"
   ```

8. **`replace(CharSequence target, CharSequence replacement)`**: Replaces all occurrences of a target with a replacement.
   ```java
   String replaced = str.replace("l", "w"); // "Hewwo"
   ```

9. **`split(String regex)`**: Splits the string based on a regular expression and returns an array.
   ```java
   String[] parts = "Hello,World".split(","); // ["Hello", "World"]
   ```

10. **`contains(CharSequence s)`**: Checks if the string contains the specified sequence of characters.
	```java
	boolean contains = str.contains("ell"); // true
	```

11. **`equals(Object another)`**: Compares the string to another string for equality.
	```java
	boolean isEqual = str.equals("Hello"); // true
	```

12. **`equalsIgnoreCase(String anotherString)`**: Compares two strings, ignoring case considerations.
	```java
	boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello"); // true
	```

13. **`startsWith(String prefix)`**: Checks if the string starts with the specified prefix.
	```java
	boolean starts = str.startsWith("He"); // true
	```

14. **`endsWith(String suffix)`**: Checks if the string ends with the specified suffix.
	```java
	boolean ends = str.endsWith("lo"); // true
	```

15. **`isEmpty()`**: Checks if the string is empty (length is 0).
	```java
	boolean empty = str.isEmpty(); // false
	```

16. **`join(CharSequence delimiter, CharSequence... elements)`**: Joins elements with a specified delimiter.
	```java
	String joined = String.join(", ", "Hello", "World"); // "Hello, World"
	```

17. **`valueOf(Object obj)`**: Returns the string representation of the given argument.
	```java
	String value = String.valueOf(123); // "123"
	```

18. **`format(String format, Object... args)`**: Formats the string with the specified arguments.
	```java
	String formatted = String.format("Hello %s", "World"); // "Hello World"
	```

These methods are highly useful for various string manipulations in Java. Let me know if you need examples or explanations for any specific method!