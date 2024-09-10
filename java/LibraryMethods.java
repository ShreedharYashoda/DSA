	class LibraryMethods {
	char charAt(int index)	// returns char value for the particular index
	int length()	// returns string length
	static String format(String format, Object... args)	// returns a formatted string.
	static String format(Locale l, String format, Object... args)	// returns formatted string with given locale.
	String substring(int beginIndex)	// returns substring for given begin index.
	String substring(int beginIndex, int endIndex)	// returns substring for given begin index and end index.
	boolean contains(CharSequence s)	// returns true or false after matching the sequence of char value.
	static String join(CharSequence delimiter, CharSequence... elements)	// returns a joined string.
	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)	// returns a joined string.
	boolean equals(Object another)	// checks the equality of string with the given object.
	boolean isEmpty()	// checks if string is empty.
	String concat(String str)	// concatenates the specified string.
	String replace(char old, char new)	// replaces all occurrences of the specified char value.
	String replace(CharSequence old, CharSequence new)	// replaces all occurrences of the specified CharSequence.
	static String equalsIgnoreCase(String another)	// compares another string. It doesn't check case.
	String[] split(String regex)	// returns a split string matching regex.
	String[] split(String regex, int limit)	// returns a split string matching regex and limit.
	String intern()	// returns an interned string.
	int indexOf(int ch)	// returns the specified char value index.
	int indexOf(int ch, int fromIndex)	// returns the specified char value index starting with given index.
	int indexOf(String substring)	//returns the specified substring index.
	int indexOf(String substring, int fromIndex)	// returns the specified substring index starting with given index.
	String toLowerCase()	// returns a string in lowercase.
	String toLowerCase(Locale l)	 // returns a string in lowercase using specified locale.
	String toUpperCase()	// returns a string in uppercase.
	String toUpperCase(Locale l)	// returns a string in uppercase using specified locale.
	String trim()	// removes beginning and ending spaces of this string.
	static String valueOf(int value)	// converts given type into string. It is an overloaded method.
}