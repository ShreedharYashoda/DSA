Here's a formatted version of your code demonstrating different ways to use `PriorityQueue` in Java:

---

### Simple PriorityQueue

By default, a `PriorityQueue` in Java functions as a Min-Heap, where the smallest element is always at the head of the queue.

```java
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(); // Min-Heap by default

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue.peek());  // Output: 10

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println(pQueue.poll());  // Output: 10

        // Printing the top element again
        System.out.println(pQueue.peek());  // Output: 15
    }
}
```

**Output:**
```
10
10
15
```

---

### Max-Heap PriorityQueue

To create a Max-Heap, you can use a `PriorityQueue` with a `Comparator` that reverses the natural ordering.

```java
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max-Heap

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(15);

        System.out.println(maxHeap.peek());  // Output: 20

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println(maxHeap.poll());  // Output: 20

        // Printing the top element again
        System.out.println(maxHeap.peek());  // Output: 15
    }
}
```

**Output:**
```
20
20
15
```

---

### Object Class PriorityQueue

You can use a custom object with `PriorityQueue` by implementing the `Comparable` interface to define the sorting behavior.

```java
import java.util.PriorityQueue;

public class ObjectPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Item> pq = new PriorityQueue<>();

        pq.add(new Item(0, 0));
        pq.add(new Item(1, 3));

        // Peek and poll methods can be used to interact with the custom object PriorityQueue
        System.out.println(pq.peek().dist);  // Output: 0
        System.out.println(pq.poll().dist);  // Output: 0
        System.out.println(pq.peek().dist);  // Output: 3
    }

    // Define the Item class with Comparable interface to specify the sorting order
    static class Item implements Comparable<Item> {
        int node;
        int dist;

        public Item(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Item item) {
            // Sort by distance in ascending order
            return Integer.compare(this.dist, item.dist);
        }
    }
}
```

**Output:**
```
0
0
3
```

---

This shows how to use `PriorityQueue` with primitive types (both Min-Heap and Max-Heap) and custom objects. The `Comparable` interface allows customizing the order of elements when working with objects. Let me know if you need any further details or explanations!







Here are some commonly used methods for `PriorityQueue` in Java:

1. **`add(E e)`**: Inserts the specified element into the priority queue. Throws an exception if the queue cannot accommodate the new element.
   ```java
   PriorityQueue<Integer> pq = new PriorityQueue<>();
   pq.add(10);
   pq.add(20);
   ```

2. **`offer(E e)`**: Inserts the specified element into the priority queue. Returns `true` if successful; otherwise, returns `false` without throwing an exception.
   ```java
   pq.offer(30);
   ```

3. **`peek()`**: Retrieves, but does not remove, the head of the queue, or returns `null` if the queue is empty.
   ```java
   Integer head = pq.peek(); // 10
   ```

4. **`poll()`**: Retrieves and removes the head of the queue, or returns `null` if the queue is empty.
   ```java
   Integer removed = pq.poll(); // 10
   ```

5. **`remove(Object o)`**: Removes a single instance of the specified element from the queue, if present.
   ```java
   pq.remove(20); // Removes 20 from the queue
   ```

6. **`size()`**: Returns the number of elements in the queue.
   ```java
   int size = pq.size(); // 1
   ```

7. **`clear()`**: Removes all the elements from the queue, making it empty.
   ```java
   pq.clear();
   ```

8. **`contains(Object o)`**: Checks if the queue contains the specified element.
   ```java
   boolean contains = pq.contains(30); // false, after clearing
   ```

9. **`isEmpty()`**: Checks if the queue is empty.
   ```java
   boolean empty = pq.isEmpty(); // true
   ```

10. **`iterator()`**: Returns an iterator over the elements in the queue, in no particular order.
	```java
	Iterator<Integer> iterator = pq.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	```

11. **`toArray()`**: Converts the priority queue elements to an array.
	```java
	Object[] array = pq.toArray();
	```

12. **`comparator()`**: Returns the comparator used to order the elements in this queue, or `null` if the queue uses natural ordering.
	```java
	Comparator<? super Integer> comparator = pq.comparator(); // null if natural ordering
	```

13. **`forEach(Consumer<? super E> action)`**: Performs the given action for each element of the queue.
	```java
	pq.forEach(System.out::println);
	```

14. **`removeIf(Predicate<? super E> filter)`**: Removes all elements of the queue that satisfy the given predicate.
	```java
	pq.removeIf(n -> n < 20); // removes elements less than 20
	```

15. **`spliterator()`**: Creates a `Spliterator` over the elements in the queue, which can be used for parallel processing.
	```java
	Spliterator<Integer> spliterator = pq.spliterator();
	```

These methods allow you to manipulate the elements within a `PriorityQueue` efficiently. Let me know if you need more information on any of these!