Traversing data structures is a fundamental skill in Java. Below is a guide on how to traverse basic data structures like arrays, lists, sets, maps, and queues in Java with examples of each:

### 1. Arrays
You can traverse an array using a traditional `for` loop, enhanced `for` loop, or streams.

```java
int[] array = {1, 2, 3, 4, 5};

// Using a traditional for loop
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}

// Using an enhanced for loop
for (int num : array) {
	System.out.println(num);
}

// Using Streams
Arrays.stream(array).forEach(System.out::println);
```

### 2. Lists (e.g., ArrayList, LinkedList)
Lists can be traversed using `for` loops, `iterator`, or streams.

```java
List<String> list = Arrays.asList("A", "B", "C");

// Using a traditional for loop
for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
}

// Using an enhanced for loop
for (String item : list) {
	System.out.println(item);
}

// Using Iterator
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
	System.out.println(iterator.next());
}

// Using Streams
list.stream().forEach(System.out::println);
```

### 3. Sets (e.g., HashSet, TreeSet)
Sets can be traversed using enhanced `for` loops, `iterator`, or streams.

```java
Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

// Using an enhanced for loop
for (int num : set) {
	System.out.println(num);
}

// Using Iterator
Iterator<Integer> setIterator = set.iterator();
while (setIterator.hasNext()) {
	System.out.println(setIterator.next());
}

// Using Streams
set.stream().forEach(System.out::println);
```

### 4. Maps (e.g., HashMap, TreeMap)
Maps are traversed using key sets, entry sets, or iterators.

```java
Map<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);
map.put("Three", 3);

// Using keySet
for (String key : map.keySet()) {
	System.out.println(key + " = " + map.get(key));
}

// Using entrySet
for (Map.Entry<String, Integer> entry : map.entrySet()) {
	System.out.println(entry.getKey() + " = " + entry.getValue());
}

// Using Iterator over entrySet
Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
while (mapIterator.hasNext()) {
	Map.Entry<String, Integer> entry = mapIterator.next();
	System.out.println(entry.getKey() + " = " + entry.getValue());
}

// Using Streams
map.forEach((key, value) -> System.out.println(key + " = " + value));
```

### 5. Queues (e.g., LinkedList, PriorityQueue)
Queues are traversed using enhanced `for` loops, `iterator`, or streams.

```java
Queue<String> queue = new LinkedList<>();
queue.add("Apple");
queue.add("Banana");
queue.add("Cherry");

// Using an enhanced for loop
for (String item : queue) {
	System.out.println(item);
}

// Using Iterator
Iterator<String> queueIterator = queue.iterator();
while (queueIterator.hasNext()) {
	System.out.println(queueIterator.next());
}

// Using Streams
queue.stream().forEach(System.out::println);
```

### Summary
- **Arrays:** Use `for`, enhanced `for`, or streams.
- **Lists:** Use `for`, enhanced `for`, `iterator`, or streams.
- **Sets:** Use enhanced `for`, `iterator`, or streams.
- **Maps:** Use `keySet`, `entrySet`, `iterator`, or `forEach`.
- **Queues:** Use enhanced `for`, `iterator`, or streams.

Let me know if you need examples for specific scenarios or additional details!