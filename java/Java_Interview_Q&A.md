### Q1 **What are the features of Java 8...? and Java 11**

Java 8 introduced a number of significant features and enhancements to the Java programming language and the Java Standard Library. Here are some of the key features introduced in Java 8:

### 1. **Lambda Expressions**
Lambda expressions provide a clear and concise way to represent a single method interface using an expression. They enable you to treat functionality as a method argument, or to create a concise way of writing anonymous classes.

```java
// Example of a lambda expression
List<String> list = Arrays.asList("one", "two", "three");
list.forEach(s -> System.out.println(s));
```

### 2. **Functional Interfaces**
A functional interface is an interface with a single abstract method. Java 8 introduces several new functional interfaces in the `java.util.function` package.

```java
@FunctionalInterface
interface MyFunctionalInterface {
	void myMethod();
}
```

### 3. **Streams API**
The Streams API allows you to process collections of objects in a functional style. It supports operations such as map, filter, and reduce.

```java
List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = stringList.stream()
								  .filter(string -> !string.isEmpty())
								  .collect(Collectors.toList());
```

### 4. **Default Methods**
Default methods, also known as defender methods, allow interfaces to have methods with implementation. This enables new methods to be added to interfaces without breaking the existing implementation.

```java
interface MyInterface {
	default void defaultMethod() {
		System.out.println("Default Method");
	}
}
```

### 5. **Date and Time API (java.time)**
Java 8 introduced a new date and time API under the `java.time` package. This new API is more comprehensive and addresses many deficiencies of the old `java.util.Date` and `java.util.Calendar` classes.

```java
LocalDate today = LocalDate.now();
LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
```

### 6. **Optional Class**
The `Optional` class is a container object which may or may not contain a non-null value. It is used to avoid `NullPointerException` and to represent the absence of a value.

```java
Optional<String> optional = Optional.ofNullable(null);
optional.ifPresent(System.out::println);
```

### 7. **Nashorn JavaScript Engine**
Java 8 includes the Nashorn JavaScript engine, which allows you to embed JavaScript code within your Java applications.

```java
ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
engine.eval("print('Hello, World!')");
```

### 8. **Parallel Array Sorting**
Java 8 provides a new method for parallel sorting of arrays in the `java.util.Arrays` class.

```java
int[] array = {5, 3, 8, 1};
Arrays.parallelSort(array);
```

### 9. **Concurrent Accumulators**
Java 8 introduces `LongAdder` and `DoubleAdder` for high-performance accumulators that can be used with counters in a multithreaded environment.

```java
LongAdder adder = new LongAdder();
adder.increment();
System.out.println(adder.sum());
```

### 10. **Base64 Encoding and Decoding**
Java 8 includes a standard Base64 encoder and decoder in the `java.util.Base64` class.

```java
String encoded = Base64.getEncoder().encodeToString("Hello".getBytes());
String decoded = new String(Base64.getDecoder().decode(encoded));
```

These are some of the major features introduced in Java 8, which brought significant improvements in terms of functionality, performance, and code readability.


**-----------------------------------------------------------------------------------------------------------------------------------------------------**

Java 11, released in September 2018, brought several new features and enhancements to the Java platform. Here are some of the key features introduced in Java 11:

### 1. **New String Methods**
Java 11 introduced several new methods to the `String` class to enhance its functionality:
- `isBlank()`: Returns `true` if the string is empty or contains only white space.
- `lines()`: Returns a stream of lines extracted from the string, separated by line terminators.
- `strip()`: Removes leading and trailing white spaces (similar to `trim()`, but more Unicode-aware).
- `stripLeading()`: Removes leading white spaces.
- `stripTrailing()`: Removes trailing white spaces.
- `repeat(int)`: Returns a string whose value is the concatenation of this string repeated `n` times.

```java
String str = "  Hello World  ";
System.out.println(str.isBlank()); // false
System.out.println(str.strip()); // "Hello World"
System.out.println(str.stripLeading()); // "Hello World  "
System.out.println(str.stripTrailing()); // "  Hello World"
System.out.println(str.repeat(2)); // "  Hello World   Hello World  "
```

### 2. **Local-Variable Syntax for Lambda Parameters**
Java 11 allows the use of `var` in lambda expressions to infer the types of the parameters. This can be useful when using annotations on lambda parameters.

```java
List<String> list = List.of("a", "b", "c");
list.forEach((@Nonnull var item) -> System.out.println(item));
```

### 3. **New Files Methods**
New methods were added to the `Files` class to improve file handling:
- `writeString(Path, CharSequence)`: Writes a string to a file.
- `readString(Path)`: Reads the contents of a file into a string.

```java
Path path = Paths.get("example.txt");
Files.writeString(path, "Hello, World!");
String content = Files.readString(path);
System.out.println(content); // "Hello, World!"
```

### 4. **Running Java Files with `java` Command**
Java 11 allows you to run single-file Java source code programs directly using the `java` command, without explicitly compiling them with `javac`.

```sh
$ java HelloWorld.java
```

### 5. **HTTP Client API**
The `HttpClient` API, introduced in an incubator module in Java 9 and standardized in Java 11, provides a modern and feature-rich HTTP client.

```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
	.uri(URI.create("https://example.com"))
	.build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

### 6. **Nested Based Access Control**
Java 11 improves access control for nested classes, allowing them to access members of their enclosing class.

### 7. **Deprecations and Removals**
Several features and APIs were deprecated or removed in Java 11:
- Removal of the Java EE and CORBA modules.
- Deprecation of the `Pack200` tools and APIs.

### 8. **Epsilon Garbage Collector**
Java 11 introduced a no-op garbage collector called Epsilon GC. It allocates memory but does not reclaim it, useful for performance testing.

### 9. **Flight Recorder**
Java Flight Recorder (JFR), previously a commercial feature, is now open-source and included in the JDK. It is a tool for collecting diagnostic and profiling data about a running Java application.

### 10. **Enhancements in Standard Library**
Several other enhancements and changes in the standard library, including improvements in the `Optional` class, and new methods in `Pattern` and `Matcher`.

```java
Optional<String> optional = Optional.of("Hello");
optional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));
```

### 11. **Removal of JavaFX**
JavaFX was removed from the JDK and is now available as a separate module.

These features and enhancements make Java 11 a robust and efficient platform, with improved ease of use and modern capabilities.


**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q2 **What is concurrent Hashmap...??**

A `ConcurrentHashMap` is a thread-safe variant of the standard Java `HashMap`. It is designed to handle concurrent access from multiple threads without requiring the use of external synchronization. This makes it particularly useful in multi-threaded programming, where it can offer better performance than other synchronized map implementations.

Here are some key features and characteristics of `ConcurrentHashMap`:

1. **Thread-Safety**: `ConcurrentHashMap` allows concurrent read and write operations. It achieves this by segmenting the map into multiple parts (or "buckets"), each of which can be locked independently. This reduces contention and increases throughput.

2. **Non-Blocking Reads**: Read operations are typically non-blocking and do not require locking. This means that multiple threads can read from the map simultaneously without waiting for each other.

3. **Lock Stripping**: Write operations (like `put`, `remove`, etc.) lock only the specific bucket that is being modified, rather than the entire map. This technique, known as lock stripping, allows for greater concurrency.

4. **No Null Values or Keys**: `ConcurrentHashMap` does not allow null keys or values. Attempting to insert a null key or value will result in a `NullPointerException`.

5. **Atomic Operations**: It supports various atomic operations like `putIfAbsent`, `remove`, `replace`, and `computeIfAbsent`, which help avoid race conditions.

6. **Consistency Guarantees**: `ConcurrentHashMap` provides a weakly consistent view of the entries. This means that iterators reflect the state of the map at some point during or after the creation of the iterator, but changes to the map after the iterator's creation may or may not be reflected.

Here is an example of how to use `ConcurrentHashMap`:

```java
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		// Adding elements
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		// Accessing elements
		System.out.println("Value for key 'One': " + map.get("One"));

		// Using atomic operations
		map.putIfAbsent("Four", 4);
		map.remove("Two", 2);
		map.replace("Three", 3, 33);

		// Iterating over elements
		map.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
```

In this example:
- Elements are added to the map using `put`.
- Elements are accessed using `get`.
- Atomic operations like `putIfAbsent`, `remove`, and `replace` are demonstrated.
- The `forEach` method is used to iterate over the map's entries.

Overall, `ConcurrentHashMap` is a powerful tool for managing concurrent access to a collection of key-value pairs, providing a good balance between performance and safety in multi-threaded applications.


**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q3 **What is Immutable class in java..?? Explain with Example.**

In Java, an immutable class is a class whose instances cannot be modified after they are created. Immutable objects are inherently thread-safe since their state cannot be changed after creation, which eliminates synchronization issues. 

### Characteristics of an Immutable Class
To create an immutable class in Java, follow these guidelines:

1. **Declare the class as `final`** so it cannot be subclassed.
2. **Make all fields `private` and `final`** to ensure that they cannot be modified after initialization.
3. **Do not provide "setter" methods** — methods that modify fields or objects referred to by fields.
4. **Ensure that fields are initialized only once** in the constructor.
5. **If the class has fields that refer to mutable objects**, ensure that these objects are not modifiable:
   - Do not allow methods to modify the mutable objects.
   - Return a copy of the object, not the object itself, in any accessor methods.

### Example of an Immutable Class
Here's an example of an immutable class in Java:

```java
public final class ImmutablePerson {
	private final String name;
	private final int age;

	// Constructor
	public ImmutablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// No setter methods

	@Override
	public String toString() {
		return "ImmutablePerson{name='" + name + "', age=" + age + "}";
	}

	public static void main(String[] args) {
		ImmutablePerson person = new ImmutablePerson("Alice", 30);
		System.out.println(person);

		// The following lines would cause compile-time errors if uncommented
		// person.name = "Bob";
		// person.setAge(25);
	}
}
```

### Handling Mutable Fields
If the class has fields that are references to mutable objects (e.g., `Date`), you need to ensure that the immutability is maintained by making defensive copies:

```java
import java.util.Date;

public final class ImmutableEmployee {
	private final String name;
	private final Date hireDate;

	// Constructor
	public ImmutableEmployee(String name, Date hireDate) {
		this.name = name;
		// Creating a defensive copy of mutable field
		this.hireDate = new Date(hireDate.getTime());
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public Date getHireDate() {
		// Returning a defensive copy of mutable field
		return new Date(hireDate.getTime());
	}

	@Override
	public String toString() {
		return "ImmutableEmployee{name='" + name + "', hireDate=" + hireDate + "}";
	}

	public static void main(String[] args) {
		Date hireDate = new Date();
		ImmutableEmployee employee = new ImmutableEmployee("Bob", hireDate);

		System.out.println(employee);

		// Trying to modify the original hireDate object after creating ImmutableEmployee
		hireDate.setTime(hireDate.getTime() + 1000000000L);

		// The hireDate inside ImmutableEmployee remains unchanged
		System.out.println(employee);
	}
}
```

### Key Points
- **Thread Safety**: Immutable objects are thread-safe since their state cannot be changed after creation.
- **Simplicity**: Immutable objects are simpler to construct, test, and use.
- **Security**: Immutable objects are inherently more secure because their state cannot be modified.

Immutable classes provide robustness and reliability in multi-threaded environments and are widely used in Java's standard library, such as `String` and `Integer`.


**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q4 **Inheritance V/S Composition**

Certainly! Here's an explanation of the difference between inheritance and composition:

### Inheritance

**Definition**:
Inheritance is an object-oriented programming (OOP) concept where a new class (subclass) inherits properties and behaviors (methods) from an existing class (superclass). 

**Key Points**:
- **"Is-a" Relationship**: Inheritance represents an "is-a" relationship. For example, a `Dog` is an `Animal`, so `Dog` can inherit from `Animal`.
- **Reusability**: It promotes code reusability. The subclass reuses code from the superclass.
- **Polymorphism**: Allows polymorphic behavior where a subclass can override methods of the superclass to provide specific functionality.
- **Hierarchy**: Creates a hierarchical classification of classes.

**Example**:

```java
class Animal {
	void eat() {
		System.out.println("This animal eats.");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("This dog barks.");
	}
}

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat(); // Inherited method
		dog.bark();
	}
}
```

### Composition

**Definition**:
Composition is a design principle where a class is composed of one or more objects of other classes, implying a "has-a" relationship.

**Key Points**:
- **"Has-a" Relationship**: Composition represents a "has-a" relationship. For example, a `Car` has an `Engine`, so `Car` can contain an `Engine` object.
- **Flexibility**: Provides greater flexibility as it allows changing the composed objects at runtime.
- **Encapsulation**: Improves encapsulation as composed objects are typically private and accessed through public methods.
- **No Hierarchy**: Does not create a hierarchical structure but rather a flat structure of classes.

**Example**:

```java
class Engine {
	void start() {
		System.out.println("Engine starts.");
	}
}

class Car {
	private Engine engine;

	public Car() {
		engine = new Engine();
	}

	void startCar() {
		engine.start();
		System.out.println("Car starts.");
	}
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.startCar();
	}
}
```

### Summary of Differences

- **Nature**: Inheritance is about creating a subclass from a superclass (is-a relationship), while composition is about building a class using other classes (has-a relationship).
- **Flexibility**: Composition is more flexible and allows for greater encapsulation and modularity compared to inheritance.
- **Hierarchy vs. Encapsulation**: Inheritance establishes a class hierarchy, whereas composition emphasizes encapsulation and code reuse without a hierarchy.
- **Design Principle**: Composition is often preferred over inheritance in design principles (like in SOLID principles), as it promotes loose coupling and better manageability of code.

Both inheritance and composition are fundamental concepts in OOP, and choosing between them depends on the specific needs and design considerations of the application.


**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q5 **What is Immutable class in java..?? Explain with Example.**

The limitations of inheritance in object-oriented programming include the following:

### 1. **Tight Coupling**
   - **Definition**: Inheritance creates a strong dependency between the parent class (superclass) and the child class (subclass).
   - **Issue**: Changes in the superclass can force modifications in the subclass, making maintenance harder and potentially introducing bugs.

### 2. **Fragile Base Class Problem**
   - **Definition**: Changes in the base class can inadvertently break the functionality of derived classes.
   - **Issue**: When the superclass evolves, it might unintentionally affect the behavior of subclasses, leading to unexpected results.

### 3. **Limited Flexibility**
   - **Definition**: Inheritance restricts the ability to modify or replace inherited behavior dynamically.
   - **Issue**: Composition offers more flexibility, as it allows for changing the composed objects at runtime, whereas inheritance locks the subclass into the behavior defined by the superclass.

### 4. **Inheritance Hierarchies Can Become Complex**
   - **Definition**: Deep inheritance hierarchies can make the code harder to understand and manage.
   - **Issue**: Understanding the entire hierarchy requires knowledge of multiple classes, making the system more complex and prone to errors.

### 5. **Encapsulation Issues**
   - **Definition**: Inheritance can expose the internal details of the superclass to the subclass.
   - **Issue**: This breaks encapsulation, as subclasses might depend on the internal implementation details of the superclass, reducing modularity.

### 6. **Single Inheritance Limitations**
   - **Definition**: Some programming languages (like Java) support only single inheritance, meaning a class can inherit from only one superclass.
   - **Issue**: This limitation can force awkward design choices, such as creating overly complex hierarchies or using interfaces in ways they were not intended.

### 7. **Reusability Concerns**
   - **Definition**: Inheritance can sometimes lead to the reuse of code in inappropriate contexts.
   - **Issue**: Subclasses might inherit behavior that is not relevant, leading to misuse or the need to override multiple methods, resulting in code duplication.

### 8. **Violation of Liskov Substitution Principle (LSP)**
   - **Definition**: LSP states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
   - **Issue**: If a subclass modifies behavior in a way that is not consistent with the superclass, it can lead to violations of LSP, causing unexpected behavior in the application.

### 9. **Difficulty in Unit Testing**
   - **Definition**: Inheritance can make unit testing more complex.
   - **Issue**: Testing subclasses often requires understanding and setting up the state of the superclass, increasing the complexity of tests.

### 10. **Inheritance Abuse**
   - **Definition**: Developers might use inheritance as a tool for code reuse rather than for modeling true "is-a" relationships.
   - **Issue**: This can lead to a poor design where inheritance is used inappropriately, resulting in brittle and hard-to-maintain codebases.

### Conclusion

While inheritance is a powerful feature in OOP, its limitations necessitate careful consideration. Composition is often preferred over inheritance to achieve greater flexibility, maintainability, and adherence to design principles like SOLID. Using inheritance judiciously and understanding its constraints can help developers create more robust and manageable code.


**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q6 **SOLID Principles**

The SOLID principles are a set of five design principles intended to make software designs more understandable, flexible, and maintainable. These principles were introduced by Robert C. Martin and are commonly used in object-oriented design.

### 1. Single Responsibility Principle (SRP)
**Definition**: A class should have only one reason to change, meaning it should have only one job or responsibility.

**Use Case**: Consider a class `Report` that handles generating, formatting, and printing reports. This violates SRP because it has multiple responsibilities.

**Example**:
Before SRP:
```java
public class Report {
	public String getReportData() {
		// fetch data
	}

	public String formatReport(String data) {
		// format data
	}

	public void printReport(String formattedData) {
		// print data
	}
}
```

After SRP:
```java
public class ReportFetcher {
	public String getReportData() {
		// fetch data
	}
}

public class ReportFormatter {
	public String formatReport(String data) {
		// format data
	}
}

public class ReportPrinter {
	public void printReport(String formattedData) {
		// print data
	}
}
```

### 2. Open/Closed Principle (OCP)
**Definition**: Software entities should be open for extension but closed for modification.

**Use Case**: Consider a `Shape` class that calculates the area of different shapes. Adding new shapes requires modifying the `Shape` class, which violates OCP.

**Example**:
Before OCP:
```java
public class Shape {
	public double calculateArea(Object shape) {
		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			return Math.PI * circle.radius * circle.radius;
		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			return rectangle.length * rectangle.width;
		}
		return 0;
	}
}
```

After OCP:
```java
public abstract class Shape {
	public abstract double calculateArea();
}

public class Circle extends Shape {
	private double radius;

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

public class Rectangle extends Shape {
	private double length;
	private double width;

	@Override
	public double calculateArea() {
		return length * width;
	}
}
```

### 3. Liskov Substitution Principle (LSP)
**Definition**: Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

**Use Case**: Consider a `Bird` class with a `fly` method. A subclass `Penguin` that cannot fly would violate LSP if used in place of `Bird`.

**Example**:
Before LSP:
```java
public class Bird {
	public void fly() {
		// flying behavior
	}
}

public class Penguin extends Bird {
	@Override
	public void fly() {
		// cannot fly
		throw new UnsupportedOperationException();
	}
}
```

After LSP:
```java
public abstract class Bird {
	// general bird properties
}

public class FlyingBird extends Bird {
	public void fly() {
		// flying behavior
	}
}

public class Penguin extends Bird {
	// penguin-specific behavior
}
```

### 4. Interface Segregation Principle (ISP)
**Definition**: A client should not be forced to depend on methods it does not use.

**Use Case**: Consider an interface `Worker` with methods `work` and `eat`. A `Robot` class that implements `Worker` should not need to implement `eat`.

**Example**:
Before ISP:
```java
public interface Worker {
	void work();
	void eat();
}

public class HumanWorker implements Worker {
	@Override
	public void work() {
		// working behavior
	}

	@Override
	public void eat() {
		// eating behavior
	}
}

public class RobotWorker implements Worker {
	@Override
	public void work() {
		// working behavior
	}

	@Override
	public void eat() {
		// robots do not eat
		throw new UnsupportedOperationException();
	}
}
```

After ISP:
```java
public interface Workable {
	void work();
}

public interface Eatable {
	void eat();
}

public class HumanWorker implements Workable, Eatable {
	@Override
	public void work() {
		// working behavior
	}

	@Override
	public void eat() {
		// eating behavior
	}
}

public class RobotWorker implements Workable {
	@Override
	public void work() {
		// working behavior
	}
}
```

### 5. Dependency Inversion Principle (DIP)
**Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.

**Use Case**: Consider a `Keyboard` class used directly by a `Computer` class. This creates a dependency on a specific implementation.

**Example**:
Before DIP:
```java
public class Keyboard {
	// keyboard details
}

public class Computer {
	private Keyboard keyboard;

	public Computer() {
		this.keyboard = new Keyboard();
	}
}
```

After DIP:
```java
public interface Keyboard {
	// keyboard abstraction
}

public class MechanicalKeyboard implements Keyboard {
	// mechanical keyboard details
}

public class Computer {
	private Keyboard keyboard;

	public Computer(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
}
```

### Conclusion
Applying the SOLID principles helps in designing a software system that is more maintainable, flexible, and easier to understand. Each principle addresses a specific aspect of software design, ensuring that classes and modules are properly encapsulated, loosely coupled, and adhere to a clear and consistent responsibility.





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q7 **What is Immutable class in java..?? Explain with Example.**

`Comparable` and `Comparator` are two interfaces in Java used for sorting objects. They serve similar purposes but are used in different contexts and have different implementations.

### Comparable

**Definition**: `Comparable` is an interface in Java that imposes a natural ordering on the objects of each class that implements it. A class that implements `Comparable` needs to override the `compareTo` method.

**Use Case**: Use `Comparable` when you want to define a natural order for objects of a class.

**Example**:
```java
import java.util.*;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.age, other.age);
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		Collections.sort(people);

		for (Person person : people) {
			System.out.println(person);
		}
	}
}
```

### Comparator

**Definition**: `Comparator` is an interface in Java used to define multiple ways of comparing two objects. It provides a `compare` method that needs to be implemented.

**Use Case**: Use `Comparator` when you want to define multiple comparison strategies or when you want to define a comparison for a class that does not have a natural order or cannot be modified to implement `Comparable`.

**Example**:
```java
import java.util.*;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		// Sort by age
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.age, p2.age);
			}
		});

		System.out.println("Sorted by age:");
		for (Person person : people) {
			System.out.println(person);
		}

		// Sort by name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.name.compareTo(p2.name);
			}
		});

		System.out.println("Sorted by name:");
		for (Person person : people) {
			System.out.println(person);
		}
	}
}
```

### Key Differences

1. **Method to Implement**:
   - `Comparable`: Implement the `compareTo` method.
   - `Comparator`: Implement the `compare` method.

2. **Location of Implementation**:
   - `Comparable`: The class itself implements the `Comparable` interface.
   - `Comparator`: A separate class implements the `Comparator` interface or use lambda expressions/anonymous classes.

3. **Number of Comparison Strategies**:
   - `Comparable`: Only one comparison strategy can be defined.
   - `Comparator`: Multiple comparison strategies can be defined.

4. **Modifying Source Code**:
   - `Comparable`: Requires modifying the class whose instances need to be sorted.
   - `Comparator`: No need to modify the class; comparisons can be defined externally.

### Use Cases

- **Comparable**: Use when there is a single, natural way to order instances of the class. For example, ordering `String` alphabetically or `Integer` numerically.
- **Comparator**: Use when there might be multiple ways to order instances of a class or when you cannot modify the class to implement `Comparable`. For example, sorting a list of `Person` objects by age, name, or any other attribute.

By understanding the differences between `Comparable` and `Comparator`, you can choose the appropriate interface based on your specific sorting requirements and design constraints.




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q8 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q9 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q10 **What is Immutable class in java..?? Explain with Example.**






**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q11 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q12 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q13 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q14 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q15 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q16 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q17 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q18 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q6 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q7 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q8 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q9 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q10 **What is Immutable class in java..?? Explain with Example.**






**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q11 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q12 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q13 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q14 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q15 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q16 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q17 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q18 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q6 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q7 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q8 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q9 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q10 **What is Immutable class in java..?? Explain with Example.**






**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q11 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q12 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q13 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q14 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q15 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q16 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q17 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q18 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q6 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q7 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q8 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q9 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q10 **What is Immutable class in java..?? Explain with Example.**






**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q11 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q12 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q13 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q14 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q15 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q16 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q17 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q18 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q6 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q7 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q8 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q9 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q10 **What is Immutable class in java..?? Explain with Example.**






**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q11 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q12 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q13 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q14 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q15 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q16 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q17 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q18 **What is Immutable class in java..?? Explain with Example.**


**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q6 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q7 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q8 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q9 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q10 **What is Immutable class in java..?? Explain with Example.**






**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q11 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q12 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q13 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q14 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q15 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q16 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q17 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q18 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q6 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q7 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q8 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q9 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q10 **What is Immutable class in java..?? Explain with Example.**






**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q11 **What is Immutable class in java..?? Explain with Example.**





**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q12 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q13 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q14 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q15 **What is Immutable class in java..?? Explain with Example.**

**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q16 **What is Immutable class in java..?? Explain with Example.**



**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q17 **What is Immutable class in java..?? Explain with Example.**




**-----------------------------------------------------------------------------------------------------------------------------------------------------**

### Q18 **What is Immutable class in java..?? Explain with Example.**