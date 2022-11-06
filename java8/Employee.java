class Employee {
	public int id;
	public String name;
	public int dept;
	public long salary;

	public Employee (int id, String name, int dept, long salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "" + this.id + " " + this.name + " " + this.dept + " " +this.salary;
	}
}