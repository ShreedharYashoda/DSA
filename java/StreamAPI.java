import java.util.*;
import java.util.stream.*;

public class StreamAPI {

	static List<Student> students = new ArrayList<>();

	static {
		students.add(new Student("Shree", "Kumar", 91.2, List.of("project 1", " project 2")));
		students.add(new Student("Pooja", "Kumari", 97.2, List.of("project 8", " project 9")));
		students.add(new Student("Boopati", "Ranga", 96.2, List.of("project 76", " project 62")));
	}

	public static void main(String[] args) {

		Stream.of(students); // gives stream of students

		// forEach : terminal operation (that means no more operations after that)
		students.stream()
				.forEach(student -> System.out.println(student.toString()));
		System.out.println();

		// map : to transform each object in stream to another object, Its an
		// intermediate operation
		List<Student> studentsIncemented = students.stream()
				.map(student -> new Student(
						student.getFirstName(),
						student.getLastName(),
						student.getAggregate() * 1.02,
						student.getProjects()))
				.collect(Collectors.toList());

		Set<Student> studentsIncementedSet = students.stream()
				.map(student -> new Student(
						student.getFirstName(),
						student.getLastName(),
						student.getAggregate() * 1.02,
						student.getProjects()))
				.collect(Collectors.toSet());
		System.out.println(studentsIncemented);
		System.out.println();

		// filter : intermediate operation (which returns stream)
		List<Student> filteredStudents = students.stream()
				.filter(student -> student.getAggregate() > 95.0)
				.map(student -> new Student(
						student.getFirstName(),
						student.getLastName(),
						student.getAggregate() * 1.02,
						student.getProjects()))
				.collect(Collectors.toList());
		System.out.println(filteredStudents);
		System.out.println();

		// findFirst
		Student firstStudents = students.stream()
				.filter(student -> student.getAggregate() > 95.0)
				.map(student -> new Student(
						student.getFirstName(),
						student.getLastName(),
						student.getAggregate() * 1.01,
						student.getProjects()))
				.findFirst()
				.orElse(null);
		System.out.println(firstStudents);
		System.out.println();

		// flatMap
		String projects = students.stream()
				.map(student -> student.getProjects())
				.flatMap(strings -> strings.stream())
				.collect(Collectors.joining(", "));
		System.out.println(projects);
		System.out.println();

		// short circuit operations
		List<Student> shortCircuit = students.stream()
				.skip(1)
				.limit(1)
				.collect(Collectors.toList());
		System.out.println(shortCircuit);
		System.out.println();

		// Finite Data
		Stream.generate(Math::random)
				.limit(5)
				.forEach(value -> System.out.println(value));
		System.out.println();

		// Sorting
		List<Student> sorted = students.stream()
				.sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
				.collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println();

		// min or max
		Student topper = students.stream()
				.max(Comparator.comparing(Student::getAggregate))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(topper);
		System.out.println();

		// reduce
		Double totalAgg = students.stream()
				.map(student -> student.getAggregate())
				.reduce(0.0, Double::sum);
		System.out.println(totalAgg / 3);
		System.out.println();

	}
}


import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			new Person("Alice", 30),
			new Person("Bob", 25),
			new Person("Charlie", 35)
		);

		OptionalDouble averageAge = people.stream()
										  .mapToInt(Person::getAge)
										  .average();

		if (averageAge.isPresent()) {
			System.out.println("Average age: " + averageAge.getAsDouble());
		} else {
			System.out.println("No people in the list.");
		}
	}
}


import java.util.*;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

// Comparator implementation for comparing Person objects based on age
class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		// Compare persons based on their age
		return Integer.compare(p1.getAge(), p2.getAge());
	}
}

public class Main {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 30),
				new Person("Charlie", 35)
		);

		// Create an instance of AgeComparator
		AgeComparator ageComparator = new AgeComparator();

		// Sort the list of people using AgeComparator
		// Option 1: Using Collections.sort()
		Collections.sort(people, ageComparator);

		// Option 2: Using List.sort() (Java 8+)
		// people.sort(ageComparator);

		// Print sorted list
		System.out.println("People sorted by age:");
		for (Person person : people) {
			System.out.println(person.getName() + " - " + person.getAge());
		}
	}
}



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "ara", "Sachin", "Dravid");
		String prefix = "S";

		// Logic to find the first name starting with the prefix
		Optional<String> result = names.stream()
				.filter(name -> name.startsWith(prefix))
				.findFirst();

		// Printing the result based on whether it is present or not
		if (result.isPresent()) {
			System.out.println("Result: " + result.get());
		} else {
			System.out.println("No result found");
		}
	}
}


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "ara", "Sachin", "Dravid");
		String prefix = "S";

		// Define a predicate to check if a name starts with the given prefix
		Predicate<String> startsWithPrefix = name -> name.startsWith(prefix);

		// Use Optional to find the first name that matches the predicate
		Optional<String> result = names.stream()
				.filter(startsWithPrefix)
				.findFirst();

		// Printing the result based on whether it is present or not
		if (result.isPresent()) {
			System.out.println("Result: " + result.get());
		} else {
			System.out.println("No result found");
		}
	}
}


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 30),
				new Person("Charlie", 35)
		);

		// Convert List<Person> to HashMap<String, Integer> using Streams
		Map<String, Integer> nameAgeMap = people.stream()
				.collect(Collectors.toMap(Person::getName, Person::getAge));

		// Print the resulting HashMap
		System.out.println("Name to Age mapping:");
		nameAgeMap.forEach((name, age) -> System.out.println(name + " -> " + age));
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}


class BaseService {
	public int data = 20;

	public void display(BaseService service) {
		System.out.println("In Base");
	}
}

class ChildService extends BaseService {
	public int data = 10;

	@Override
	public void display(BaseService service) {
		System.out.println("In Child");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		BaseService base = new ChildService();

		// Output 1
		System.out.println(base.data); // Output: 20 (Accesses data from BaseService)

		// Output 2
		base.display(base); // Output: "In Child" (Dynamic method dispatch calls ChildService's display method)

		ChildService child = new ChildService();

		// Output 3
		System.out.println(child.data); // Output: 10 (Accesses data from ChildService)

		// Output 4
		child.display(new BaseService()); // Output: "In Child" (Dynamic method dispatch calls ChildService's display method)
	}
}
