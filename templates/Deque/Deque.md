The `ArrayDeque` class in Java implements the `Deque` interface, which provides a variety of operations for working with double-ended queues. Here's a comprehensive list of operations available on `Deque` when using `ArrayDeque`:

### Basic Operations

1. **Adding Elements**
   - `add(E e)`: Adds the specified element to the end of the deque.
   - `addFirst(E e)`: Inserts the specified element at the front of the deque.
   - `addLast(E e)`: Inserts the specified element at the end of the deque.
   - `offer(E e)`: Inserts the specified element at the end of the deque (similar to `add`).
   - `offerFirst(E e)`: Inserts the specified element at the front of the deque.
   - `offerLast(E e)`: Inserts the specified element at the end of the deque.
   - `push(E e)`: Pushes an element onto the stack represented by this deque (equivalent to `addFirst`).

2. **Removing Elements**
   - `remove()`: Retrieves and removes the head of the deque.
   - `removeFirst()`: Retrieves and removes the first element of the deque.
   - `removeLast()`: Retrieves and removes the last element of the deque.
   - `poll()`: Retrieves and removes the head of the deque, or returns `null` if the deque is empty.
   - `pollFirst()`: Retrieves and removes the first element of the deque, or returns `null` if the deque is empty.
   - `pollLast()`: Retrieves and removes the last element of the deque, or returns `null` if the deque is empty.
   - `pop()`: Pops an element from the stack represented by this deque (equivalent to `removeFirst`).

3. **Peeking at Elements**
   - `element()`: Retrieves, but does not remove, the head of the deque.
   - `peek()`: Retrieves, but does not remove, the head of the deque, or returns `null` if the deque is empty.
   - `peekFirst()`: Retrieves, but does not remove, the first element of the deque, or returns `null` if the deque is empty.
   - `peekLast()`: Retrieves, but does not remove, the last element of the deque, or returns `null` if the deque is empty.

4. **Checking for Elements**
   - `contains(Object o)`: Returns `true` if the deque contains the specified element.
   - `isEmpty()`: Returns `true` if the deque contains no elements.
   - `size()`: Returns the number of elements in the deque.

### Advanced Operations

5. **Bulk Operations**
   - `iterator()`: Returns an iterator over the elements in the deque.
   - `descendingIterator()`: Returns an iterator over the elements in the deque in reverse sequential order.
   - `removeFirstOccurrence(Object o)`: Removes the first occurrence of the specified element from the deque.
   - `removeLastOccurrence(Object o)`: Removes the last occurrence of the specified element from the deque.

6. **Array Conversion**
   - `toArray()`: Returns an array containing all of the elements in the deque.
   - `toArray(T[] a)`: Returns an array containing all of the elements in the deque; the runtime type of the returned array is that of the specified array.

### Example Usage

Here's an example that demonstrates some of these operations:

```java
Deque<Integer> deque = new ArrayDeque<>();

// Adding elements
deque.add(1);          // [1]
deque.addFirst(2);     // [2, 1]
deque.addLast(3);      // [2, 1, 3]
deque.offer(4);        // [2, 1, 3, 4]
deque.offerFirst(5);   // [5, 2, 1, 3, 4]
deque.offerLast(6);    // [5, 2, 1, 3, 4, 6]
deque.push(7);         // [7, 5, 2, 1, 3, 4, 6]

// Removing elements
deque.remove();        // [5, 2, 1, 3, 4, 6]
deque.removeFirst();   // [2, 1, 3, 4, 6]
deque.removeLast();    // [2, 1, 3, 4]
deque.poll();          // [1, 3, 4]
deque.pollFirst();     // [3, 4]
deque.pollLast();      // [3]
deque.pop();           // []

// Peeking at elements
deque.add(10);
deque.add(20);
System.out.println(deque.element());    // 10
System.out.println(deque.peek());       // 10
System.out.println(deque.peekFirst());  // 10
System.out.println(deque.peekLast());   // 20

// Checking for elements
System.out.println(deque.contains(10)); // true
System.out.println(deque.isEmpty());    // false
System.out.println(deque.size());       // 2

// Iterators
for (int i : deque) {
	System.out.println(i);              // 10 20
}
Iterator<Integer> descIter = deque.descendingIterator();
while (descIter.hasNext()) {
	System.out.println(descIter.next()); // 20 10
}

// Array conversion
Object[] array = deque.toArray();
Integer[] intArray = deque.toArray(new Integer[0]);

// Removing occurrences
deque.add(10);
deque.removeFirstOccurrence(10); // removes first 10
deque.removeLastOccurrence(20);  // removes 20
```

This example demonstrates a variety of operations available on an `ArrayDeque` through the `Deque` interface.