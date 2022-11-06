import java.util.List;

public class Student{
	private String firstName;
	private String lastName;
	private Double aggregate;
	private List<String> projects;

	public Student(String firstName, String lastName, Double aggregate, List<String> projects) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.aggregate = aggregate;
		this.projects = projects;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Double getAggregate() {
		return this.aggregate;
	}

	public List<String> getProjects() {
		return this.projects;
	}

	public String toString() {
		return "" + this.firstName + " " + this.lastName + " " + this.aggregate + " " +this.projects;
	}
	
}