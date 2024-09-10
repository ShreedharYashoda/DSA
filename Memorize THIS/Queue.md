Here are some commonly used methods of the `Queue` interface in Java, which is implemented by classes like `LinkedList`, `PriorityQueue`, and others:

1. **`add(E e)`**: Inserts the specified element into the queue. Throws an exception if the queue cannot accommodate the new element.
   ```java
   Queue<Integer> queue = new LinkedList<>();
   queue.add(10);
   queue.add(20);
   queue.add(30); // Queue: [10, 20, 30]
   ```

2. **`offer(E e)`**: Inserts the specified element into the queue. Returns `true` if successful; otherwise, returns `false` without throwing an exception.
   ```java
   queue.offer(40); // Queue: [10, 20, 30, 40]
   ```

3. **`remove()`**: Removes and returns the head of the queue. Throws `NoSuchElementException` if the queue is empty.
   ```java
   int head = queue.remove(); // Returns 10, Queue: [20, 30, 40]
   ```

4. **`poll()`**: Retrieves and removes the head of the queue, or returns `null` if the queue is empty.
   ```java
   Integer head = queue.poll(); // Returns 20, Queue: [30, 40]
   ```

5. **`element()`**: Retrieves, but does not remove, the head of the queue. Throws `NoSuchElementException` if the queue is empty.
   ```java
   int head = queue.element(); // Returns 30, Queue remains: [30, 40]
   ```

6. **`peek()`**: Retrieves, but does not remove, the head of the queue, or returns `null` if the queue is empty.
   ```java
   Integer head = queue.peek(); // Returns 30, Queue remains: [30, 40]
   ```

7. **`isEmpty()`**: Checks if the queue is empty.
   ```java
   boolean empty = queue.isEmpty(); // false
   ```

8. **`size()`**: Returns the number of elements in the queue.
   ```java
   int size = queue.size(); // 2
   ```

9. **`contains(Object o)`**: Checks if the queue contains the specified element.
   ```java
   boolean contains = queue.contains(30); // true
   ```

10. **`clear()`**: Removes all elements from the queue, making it empty.
	```java
	queue.clear(); // Queue: []
	```

11. **`toArray()`**: Converts the queue elements to an array.
	```java
	Object[] array = queue.toArray();
	```

12. **`iterator()`**: Returns an iterator over the elements in the queue.
	```java
	Iterator<Integer> iterator = queue.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	```

13. **`forEach(Consumer<? super E> action)`**: Performs the given action for each element of the queue.
	```java
	queue.forEach(System.out::println); // Prints each element in the queue
	```

14. **`remove(Object o)`**: Removes a single instance of the specified element from the queue, if present.
	```java
	queue.remove(30); // Removes 30 from the queue
	```

15. **`spliterator()`**: Creates a `Spliterator` over the elements in the queue, which can be used for parallel processing.
	```java
	Spliterator<Integer> spliterator = queue.spliterator();
	```

These methods allow efficient manipulation of queues, making them suitable for implementing FIFO (First-In-First-Out) operations, which are commonly used in scheduling, buffering, and other scenarios requiring sequential processing of data. Let me know if you need more details or specific examples!