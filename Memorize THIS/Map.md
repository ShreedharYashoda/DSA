Here’s an overview of commonly used methods and operations for the `Map` interface in Java, which is implemented by classes like `HashMap`, `LinkedHashMap`, and `TreeMap`. A `Map` is an object that maps keys to values, with each key being associated with exactly one value.

### Commonly Used Methods of `Map`

#### Basic Operations

1. **`put(K key, V value)`**: Associates the specified value with the specified key in the map. If the map previously contained a mapping for the key, the old value is replaced.
   ```java
   Map<String, Integer> map = new HashMap<>();
   map.put("one", 1);
   map.put("two", 2); // Map: {one=1, two=2}
   ```

2. **`get(Object key)`**: Returns the value associated with the specified key, or `null` if the map contains no mapping for the key.
   ```java
   Integer value = map.get("one"); // Returns 1
   ```

3. **`remove(Object key)`**: Removes the mapping for the specified key from the map if present. Returns the value to which this map previously associated the key, or `null` if the map contained no mapping for the key.
   ```java
   Integer removedValue = map.remove("one"); // Returns 1, Map: {two=2}
   ```

4. **`containsKey(Object key)`**: Checks if the map contains a mapping for the specified key.
   ```java
   boolean hasKey = map.containsKey("two"); // true
   ```

5. **`containsValue(Object value)`**: Checks if the map maps one or more keys to the specified value.
   ```java
   boolean hasValue = map.containsValue(2); // true
   ```

6. **`size()`**: Returns the number of key-value mappings in the map.
   ```java
   int size = map.size(); // 1
   ```

7. **`isEmpty()`**: Checks if the map is empty.
   ```java
   boolean empty = map.isEmpty(); // false
   ```

8. **`clear()`**: Removes all mappings from the map.
   ```java
   map.clear(); // Map: {}
   ```

#### Key and Value Operations

1. **`keySet()`**: Returns a set view of the keys contained in the map.
   ```java
   Set<String> keys = map.keySet(); // [two]
   ```

2. **`values()`**: Returns a collection view of the values contained in the map.
   ```java
   Collection<Integer> values = map.values(); // [2]
   ```

3. **`entrySet()`**: Returns a set view of the mappings contained in the map.
   ```java
   Set<Map.Entry<String, Integer>> entries = map.entrySet();
   for (Map.Entry<String, Integer> entry : entries) {
	   System.out.println(entry.getKey() + "=" + entry.getValue());
   }
   ```

4. **`putAll(Map<? extends K, ? extends V> m)`**: Copies all of the mappings from the specified map to this map.
   ```java
   Map<String, Integer> anotherMap = new HashMap<>();
   anotherMap.put("three", 3);
   map.putAll(anotherMap); // Map: {two=2, three=3}
   ```

5. **`replace(K key, V value)`**: Replaces the entry for the specified key only if it is currently mapped to some value.
   ```java
   map.replace("two", 22); // Map: {two=22, three=3}
   ```

6. **`replace(K key, V oldValue, V newValue)`**: Replaces the entry for the specified key only if currently mapped to the specified value.
   ```java
   boolean replaced = map.replace("two", 22, 20); // Returns true, Map: {two=20, three=3}
   ```

7. **`compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)`**: Computes a new value for the specified key using the provided remapping function.
   ```java
   map.compute("three", (key, value) -> (value == null) ? 1 : value + 1); // Map: {two=20, three=4}
   ```

8. **`merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)`**: Merges the specified value with the existing value for the specified key using the provided remapping function.
   ```java
   map.merge("two", 10, Integer::sum); // Map: {two=30, three=4}
   ```

### Key Points

- **Implementations**:
  - **`HashMap`**: Provides constant-time performance for basic operations and does not guarantee any order of elements.
  - **`LinkedHashMap`**: Maintains insertion order using a linked list, providing predictable iteration order.
  - **`TreeMap`**: Implements `SortedMap`, storing keys in a sorted order based on their natural ordering or a custom comparator.
- **No Duplicate Keys**: A `Map` does not allow duplicate keys, but it can have duplicate values.
- **Performance**: Performance can vary between different `Map` implementations in terms of insertion, deletion, and access times.

These methods and operations provide flexibility for managing key-value pairs in various applications. Let me know if you need more details or examples!