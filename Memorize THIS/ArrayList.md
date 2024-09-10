Here's an overview of commonly used methods and operations for `ArrayList` in Java, one of the most widely used dynamic array implementations:

### Commonly Used Methods of `ArrayList`

1. **`add(E e)`**: Adds the specified element to the end of the list.
   ```java
   ArrayList<Integer> list = new ArrayList<>();
   list.add(10);
   list.add(20);
   list.add(30); // List: [10, 20, 30]
   ```

2. **`add(int index, E element)`**: Inserts the specified element at the specified position in the list.
   ```java
   list.add(1, 15); // List: [10, 15, 20, 30]
   ```

3. **`remove(int index)`**: Removes the element at the specified position in the list.
   ```java
   list.remove(2); // Removes element at index 2, List: [10, 15, 30]
   ```

4. **`remove(Object o)`**: Removes the first occurrence of the specified element from the list.
   ```java
   list.remove(Integer.valueOf(15)); // Removes 15, List: [10, 30]
   ```

5. **`get(int index)`**: Returns the element at the specified position in the list.
   ```java
   int element = list.get(1); // Returns 30
   ```

6. **`set(int index, E element)`**: Replaces the element at the specified position with the specified element.
   ```java
   list.set(1, 25); // List: [10, 25]
   ```

7. **`size()`**: Returns the number of elements in the list.
   ```java
   int size = list.size(); // Output: 2
   ```

8. **`isEmpty()`**: Checks if the list is empty.
   ```java
   boolean empty = list.isEmpty(); // false
   ```

9. **`contains(Object o)`**: Checks if the list contains the specified element.
   ```java
   boolean contains = list.contains(25); // true
   ```

10. **`indexOf(Object o)`**: Returns the index of the first occurrence of the specified element, or `-1` if the element is not found.
	```java
	int index = list.indexOf(25); // Output: 1
	```

11. **`lastIndexOf(Object o)`**: Returns the index of the last occurrence of the specified element, or `-1` if the element is not found.
	```java
	list.add(10);
	int lastIndex = list.lastIndexOf(10); // Output: 2
	```

12. **`clear()`**: Removes all elements from the list, making it empty.
	```java
	list.clear(); // List: []
	```

13. **`toArray()`**: Converts the list into an array.
	```java
	Integer[] array = list.toArray(new Integer[0]);
	```

14. **`addAll(Collection<? extends E> c)`**: Adds all elements from the specified collection to the end of the list.
	```java
	ArrayList<Integer> newList = new ArrayList<>();
	newList.addAll(Arrays.asList(1, 2, 3)); // List: [1, 2, 3]
	```

15. **`subList(int fromIndex, int toIndex)`**: Returns a view of the portion of the list between the specified indices.
	```java
	List<Integer> sublist = newList.subList(1, 3); // Sublist: [2, 3]
	```

16. **`iterator()`**: Returns an iterator over the elements in the list.
	```java
	Iterator<Integer> iterator = list.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	```

17. **`forEach(Consumer<? super E> action)`**: Performs the given action for each element of the list.
	```java
	list.forEach(System.out::println); // Prints each element
	```

18. **`retainAll(Collection<?> c)`**: Retains only the elements in the list that are contained in the specified collection.
	```java
	list.retainAll(Arrays.asList(10, 25)); // Keeps only 10 and 25
	```

19. **`removeAll(Collection<?> c)`**: Removes all elements from the list that are contained in the specified collection.
	```java
	list.removeAll(Arrays.asList(10)); // Removes all occurrences of 10
	```

20. **`sort(Comparator<? super E> c)`**: Sorts the list according to the order induced by the specified comparator.
	```java
	list.sort(Comparator.naturalOrder()); // Sorts the list in ascending order
	```

21. **`replaceAll(UnaryOperator<E> operator)`**: Replaces each element of the list with the result of applying the operator to that element.
	```java
	list.replaceAll(x -> x * 2); // Doubles each element
	```

22. **`ensureCapacity(int minCapacity)`**: Increases the capacity of the list, if necessary, to ensure that it can hold at least the specified number of elements.
	```java
	list.ensureCapacity(20); // Pre-allocate capacity for 20 elements
	```

### Key Points
- **Dynamic Size**: `ArrayList` automatically resizes itself when elements are added or removed.
- **Zero-based Indexing**: Elements are accessed based on their position, starting from 0.
- **Performance**: `ArrayList` provides fast random access (`O(1)`), but slower insertions/removals (`O(n)`) if done in the middle of the list.

These methods make `ArrayList` a flexible and powerful choice for dynamic array manipulation in Java. Let me know if you need further explanations or examples!