Here’s an overview of commonly used methods and operations for `LinkedList` in Java, which implements both `List` and `Deque` interfaces, offering a doubly linked list implementation:

### Commonly Used Methods of `LinkedList`

#### List Operations

1. **`add(E e)`**: Appends the specified element to the end of the list.
   ```java
   LinkedList<Integer> list = new LinkedList<>();
   list.add(10);
   list.add(20); // List: [10, 20]
   ```

2. **`add(int index, E element)`**: Inserts the specified element at the specified position in the list.
   ```java
   list.add(1, 15); // List: [10, 15, 20]
   ```

3. **`remove(int index)`**: Removes the element at the specified position in the list.
   ```java
   list.remove(1); // List: [10, 20]
   ```

4. **`remove(Object o)`**: Removes the first occurrence of the specified element.
   ```java
   list.remove(Integer.valueOf(20)); // List: [10]
   ```

5. **`get(int index)`**: Returns the element at the specified position in the list.
   ```java
   int element = list.get(0); // Returns 10
   ```

6. **`set(int index, E element)`**: Replaces the element at the specified position with the specified element.
   ```java
   list.set(0, 25); // List: [25]
   ```

7. **`size()`**: Returns the number of elements in the list.
   ```java
   int size = list.size(); // Output: 1
   ```

8. **`isEmpty()`**: Checks if the list is empty.
   ```java
   boolean empty = list.isEmpty(); // false
   ```

9. **`contains(Object o)`**: Checks if the list contains the specified element.
   ```java
   boolean contains = list.contains(25); // true
   ```

10. **`clear()`**: Removes all elements from the list.
	```java
	list.clear(); // List: []
	```

11. **`toArray()`**: Converts the list into an array.
	```java
	Integer[] array = list.toArray(new Integer[0]);
	```

12. **`addAll(Collection<? extends E> c)`**: Adds all elements from the specified collection to the end of the list.
	```java
	LinkedList<Integer> newList = new LinkedList<>();
	newList.addAll(Arrays.asList(1, 2, 3)); // List: [1, 2, 3]
	```

13. **`subList(int fromIndex, int toIndex)`**: Returns a view of the portion of the list between the specified indices.
	```java
	List<Integer> sublist = newList.subList(1, 3); // Sublist: [2, 3]
	```

#### Deque Operations

1. **`addFirst(E e)`**: Inserts the specified element at the front of the deque.
   ```java
   list.addFirst(5); // List: [5, 10, 20]
   ```

2. **`addLast(E e)`**: Appends the specified element to the end of the deque.
   ```java
   list.addLast(30); // List: [5, 10, 20, 30]
   ```

3. **`offerFirst(E e)`**: Inserts the specified element at the front of the deque, returning `true` if successful.
   ```java
   list.offerFirst(1); // List: [1, 5, 10, 20, 30]
   ```

4. **`offerLast(E e)`**: Appends the specified element to the end of the deque, returning `true` if successful.
   ```java
   list.offerLast(40); // List: [1, 5, 10, 20, 30, 40]
   ```

5. **`removeFirst()`**: Removes and returns the first element of the deque.
   ```java
   int first = list.removeFirst(); // Returns 1, List: [5, 10, 20, 30, 40]
   ```

6. **`removeLast()`**: Removes and returns the last element of the deque.
   ```java
   int last = list.removeLast(); // Returns 40, List: [5, 10, 20, 30]
   ```

7. **`peekFirst()`**: Retrieves, but does not remove, the first element of the deque.
   ```java
   int first = list.peekFirst(); // Returns 5
   ```

8. **`peekLast()`**: Retrieves, but does not remove, the last element of the deque.
   ```java
   int last = list.peekLast(); // Returns 30
   ```

9. **`pollFirst()`**: Retrieves and removes the first element of the deque, or returns `null` if the deque is empty.
   ```java
   int first = list.pollFirst(); // Returns 5
   ```

10. **`pollLast()`**: Retrieves and removes the last element of the deque, or returns `null` if the deque is empty.
	```java
	int last = list.pollLast(); // Returns 30
	```

11. **`descendingIterator()`**: Returns an iterator over the elements in this deque in reverse order.
	```java
	Iterator<Integer> descendingIterator = list.descendingIterator();
	while (descendingIterator.hasNext()) {
		System.out.println(descendingIterator.next());
	}
	```

### Key Points
- **Doubly Linked List**: `LinkedList` uses a doubly linked list data structure, allowing efficient insertions and deletions.
- **List and Deque Implementation**: It implements both `List` and `Deque` interfaces, providing methods for both sequential and double-ended queue operations.
- **Performance**: It provides constant-time insertions and deletions at the beginning and end, but random access (by index) is slower compared to `ArrayList`.

These methods provide flexibility for various operations on `LinkedList`, making it suitable for scenarios requiring frequent insertions and deletions. Let me know if you need further explanations or examples!