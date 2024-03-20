package Collection.LinkedhashMap;

import java.util.*;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}
}
