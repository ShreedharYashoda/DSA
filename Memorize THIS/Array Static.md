In Java, arrays are a static type data structure, meaning their size is fixed once they are created. Here’s a detailed look at commonly used operations and methods associated with arrays in Java:

### Common Array Operations in Java

1. **Array Declaration and Initialization**
   - Arrays can be declared and initialized in a single statement or separately.
   ```java
   // Declaration and initialization
   int[] arr = new int[5];        // Array of size 5, default values are 0
   int[] arr2 = {10, 20, 30, 40}; // Array with initial values
   ```

2. **Access Elements**
   - Elements are accessed using their index, starting from 0.
   ```java
   int firstElement = arr2[0]; // Access first element, Output: 10
   ```

3. **Modify Elements**
   - Array elements can be modified directly using their index.
   ```java
   arr2[1] = 50; // Modifies second element to 50
   ```

4. **Array Length**
   - `length` is a property that returns the size of the array.
   ```java
   int length = arr2.length; // Output: 4
   ```

5. **Iterate Over Array**
   - Arrays can be iterated using loops like `for`, `for-each`, or `while`.
   ```java
   // Using for-each loop
   for (int num : arr2) {
	   System.out.println(num); // Prints elements of arr2
   }
   ```

6. **Copying Arrays**
   - Arrays can be copied using `System.arraycopy()`, `Arrays.copyOf()`, or `clone()`.
   ```java
   int[] copiedArr = Arrays.copyOf(arr2, arr2.length); // Copies arr2 into copiedArr
   ```

7. **Sorting an Array**
   - Use `Arrays.sort()` to sort an array in ascending order.
   ```java
   Arrays.sort(arr2); // Sorts the array arr2
   ```

8. **Searching in an Array**
   - Use `Arrays.binarySearch()` to search for elements in a sorted array.
   ```java
   int index = Arrays.binarySearch(arr2, 30); // Searches for 30 in arr2
   ```

9. **Fill an Array**
   - Use `Arrays.fill()` to set all elements of the array to a specific value.
   ```java
   Arrays.fill(arr, 7); // Fills arr with 7s
   ```

10. **Convert Array to String**
	- Use `Arrays.toString()` to get a string representation of the array.
	```java
	String arrStr = Arrays.toString(arr2); // "[10, 50, 30, 40]"
	```

11. **Array Cloning**
	- The `clone()` method creates a shallow copy of the array.
	```java
	int[] clonedArr = arr2.clone(); // Clones arr2
	```

12. **Parallel Sorting**
	- Use `Arrays.parallelSort()` for faster sorting on multi-core processors.
	```java
	Arrays.parallelSort(arr2); // Sorts arr2 using parallel sorting
	```

13. **Multidimensional Arrays**
	- Java supports multidimensional arrays, such as 2D arrays.
	```java
	int[][] matrix = new int[3][3]; // 3x3 matrix
	matrix[0][0] = 1;               // Setting value
	```

14. **Iterate Multidimensional Arrays**
	- Nested loops are used to access elements in multidimensional arrays.
	```java
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length; j++) {
			System.out.print(matrix[i][j] + " ");
		}
		System.out.println();
	}
	```

15. **Convert Array to List**
	- Use `Arrays.asList()` to convert an array to a `List`.
	```java
	List<Integer> list = Arrays.asList(arr2); // Converts arr2 to List
	```

### Important Notes
- **Fixed Size**: Once an array is created, its size cannot be changed.
- **Zero-based Indexing**: Array indices start at 0.
- **Homogeneous Elements**: All elements in the array must be of the same type.

These operations and methods are key for working with arrays in Java, allowing you to create, manipulate, and process array data efficiently. Let me know if you need further explanations or examples!