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

		//forEach : terminal operation (that means no more operations after that)
		students.stream()
			.forEach(student -> System.out.println(student.toString()));
		System.out.println();

		//map : to transform each object in stream to another object, Its an intermediate operation
		List<Student> studentsIncemented = students.stream()
			.map(student -> new Student(
				student.getFirstName(),
				student.getLastName(),
				student.getAggregate() * 1.02,
				student.getProjects()
			))
			.collect(Collectors.toList());

		Set<Student> studentsIncementedSet = students.stream()
			.map(student -> new Student(
				student.getFirstName(),
				student.getLastName(),
				student.getAggregate() * 1.02,
				student.getProjects()
			))
			.collect(Collectors.toSet());
		System.out.println(studentsIncemented);
		System.out.println();


		//filter : intermediate operation (which returns stream)
		List<Student> filteredStudents = students.stream()
			.filter(student -> student.getAggregate() > 95.0)
			.map(student -> new Student(
				student.getFirstName(),
				student.getLastName(),
				student.getAggregate() * 1.02,
				student.getProjects()
			))
			.collect(Collectors.toList());
		System.out.println(filteredStudents);
		System.out.println();

		//findFirst
		Student firstStudents = students.stream()
			.filter(student -> student.getAggregate() > 95.0)
			.map(student -> new Student(
				student.getFirstName(),
				student.getLastName(),
				student.getAggregate() * 1.01,
				student.getProjects()
			))
			.findFirst()
			.orElse(null);
		System.out.println(firstStudents);
		System.out.println();
		
		
		//flatMap
		String projects = students.stream()
			.map(student -> student.getProjects())
			.flatMap(strings -> strings.stream())
			.collect(Collectors.joining(", "));
		System.out.println(projects);
		System.out.println();

		//short circuit operations
		List<Student> shortCircuit = students.stream()
			.skip(1)
			.limit(1)
			.collect(Collectors.toList());
		System.out.println(shortCircuit);
		System.out.println();

		//Finite Data
		Stream.generate(Math::random)
			.limit(5)
			.forEach(value -> System.out.println(value));
			System.out.println();


		//Sorting
		List<Student> sorted = students.stream()
			.sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
			.collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println();

		//min or max
		Student topper = students.stream()
			.max(Comparator.comparing(Student::getAggregate))
			.orElseThrow(NoSuchElementException::new);
		System.out.println(topper);
		System.out.println();

		//reduce
		Double totalAgg = students.stream()
			.map(student -> student.getAggregate())
			.reduce(0.0, Double::sum);
		System.out.println(totalAgg/3);
		System.out.println();
			
	}
}
