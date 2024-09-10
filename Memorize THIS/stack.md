Here are some commonly used methods of `Stack` in Java:

1. **`push(E item)`**: Pushes an item onto the top of the stack.
   ```java
   Stack<Integer> stack = new Stack<>();
   stack.push(10);
   stack.push(20);
   stack.push(30); // Stack: [10, 20, 30]
   ```

2. **`pop()`**: Removes the object at the top of the stack and returns it. Throws `EmptyStackException` if the stack is empty.
   ```java
   int topElement = stack.pop(); // Returns 30, Stack: [10, 20]
   ```

3. **`peek()`**: Returns the object at the top of the stack without removing it. Throws `EmptyStackException` if the stack is empty.
   ```java
   int topElement = stack.peek(); // Returns 20, Stack remains: [10, 20]
   ```

4. **`isEmpty()`**: Checks if the stack is empty.
   ```java
   boolean empty = stack.isEmpty(); // false
   ```

5. **`search(Object o)`**: Returns the 1-based position from the top of the stack where the object is located, or `-1` if the object is not found.
   ```java
   int position = stack.search(10); // Returns 2 (1-based position from the top)
   ```

6. **`size()`**: Returns the number of elements in the stack.
   ```java
   int size = stack.size(); // 2
   ```

7. **`clear()`**: Removes all elements from the stack.
   ```java
   stack.clear(); // Stack: []
   ```

8. **`contains(Object o)`**: Checks if the stack contains the specified element.
   ```java
   boolean contains = stack.contains(20); // false after clearing
   ```

9. **`iterator()`**: Returns an iterator over the elements in the stack in proper sequence.
   ```java
   Iterator<Integer> iterator = stack.iterator();
   while (iterator.hasNext()) {
	   System.out.println(iterator.next());
   }
   ```

10. **`toArray()`**: Converts the stack to an array.
	```java
	Object[] array = stack.toArray();
	```

11. **`add(int index, E element)`**: Inserts the specified element at the specified position in the stack.
	```java
	stack.add(0, 5); // Stack: [5, 10, 20]
	```

12. **`remove(int index)`**: Removes the element at the specified position in the stack.
	```java
	stack.remove(0); // Stack: [10, 20]
	```

13. **`set(int index, E element)`**: Replaces the element at the specified position in the stack with the specified element.
	```java
	stack.set(0, 15); // Stack: [15, 20]
	```

14. **`subList(int fromIndex, int toIndex)`**: Returns a view of the portion of this stack between the specified indices.
	```java
	List<Integer> sublist = stack.subList(0, 2); // Returns a sublist [15, 20]
	```

15. **`forEach(Consumer<? super E> action)`**: Performs the given action for each element of the stack.
	```java
	stack.forEach(System.out::println); // Prints each element
	```

These methods allow you to manipulate the `Stack` efficiently, providing typical stack operations like push, pop, and peek, along with some list-based operations since `Stack` extends `Vector`. Let me know if you need further details or examples!