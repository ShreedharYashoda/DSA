Here’s an overview of commonly used methods and operations for the `Set` interface in Java, which is implemented by classes like `HashSet`, `LinkedHashSet`, and `TreeSet`. A `Set` is a collection that does not allow duplicate elements.

### Commonly Used Methods of `Set`

1. **`add(E e)`**: Adds the specified element to the set if it is not already present. Returns `true` if the set did not already contain the element.
   ```java
   Set<Integer> set = new HashSet<>();
   set.add(10); // Returns true, set: [10]
   set.add(20); // Returns true, set: [10, 20]
   set.add(10); // Returns false, set remains: [10, 20]
   ```

2. **`remove(Object o)`**: Removes the specified element from the set if it is present. Returns `true` if the set contained the specified element.
   ```java
   set.remove(20); // Returns true, set: [10]
   ```

3. **`contains(Object o)`**: Checks if the set contains the specified element.
   ```java
   boolean contains = set.contains(10); // true
   ```

4. **`size()`**: Returns the number of elements in the set.
   ```java
   int size = set.size(); // 1
   ```

5. **`isEmpty()`**: Checks if the set is empty.
   ```java
   boolean empty = set.isEmpty(); // false
   ```

6. **`clear()`**: Removes all elements from the set.
   ```java
   set.clear(); // Set: []
   ```

7. **`toArray()`**: Converts the set to an array.
   ```java
   Integer[] array = set.toArray(new Integer[0]);
   ```

8. **`iterator()`**: Returns an iterator over the elements in the set.
   ```java
   Iterator<Integer> iterator = set.iterator();
   while (iterator.hasNext()) {
	   System.out.println(iterator.next());
   }
   ```

9. **`forEach(Consumer<? super E> action)`**: Performs the given action for each element of the set.
   ```java
   set.forEach(System.out::println);
   ```

10. **`addAll(Collection<? extends E> c)`**: Adds all elements from the specified collection to the set.
	```java
	Set<Integer> anotherSet = new HashSet<>(Arrays.asList(30, 40));
	set.addAll(anotherSet); // Set: [10, 30, 40]
	```

11. **`removeAll(Collection<?> c)`**: Removes from the set all elements that are contained in the specified collection.
	```java
	set.removeAll(Arrays.asList(10)); // Set: [30, 40]
	```

12. **`retainAll(Collection<?> c)`**: Retains only the elements in the set that are contained in the specified collection.
	```java
	set.retainAll(Arrays.asList(30)); // Set: [30]
	```

13. **`containsAll(Collection<?> c)`**: Checks if the set contains all elements of the specified collection.
	```java
	boolean containsAll = set.containsAll(Arrays.asList(30)); // true
	```

14. **`spliterator()`**: Returns a `Spliterator` over the elements in the set.
	```java
	Spliterator<Integer> spliterator = set.spliterator();
	```

### Key Points

- **No Duplicates**: A `Set` does not allow duplicate elements.
- **Implementations**:
  - **`HashSet`**: Uses a hash table, provides constant-time performance for basic operations.
  - **`LinkedHashSet`**: Maintains insertion order using a linked list.
  - **`TreeSet`**: Implements the `NavigableSet` interface and stores elements in a sorted (natural or custom) order.
- **Performance**: Performance of operations can vary between different implementations (`HashSet`, `LinkedHashSet`, `TreeSet`).

These methods allow efficient manipulation and querying of sets, making them useful for scenarios where uniqueness of elements is a key requirement. Let me know if you need further details or examples!