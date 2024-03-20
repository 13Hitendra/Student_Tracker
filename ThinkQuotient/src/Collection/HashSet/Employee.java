package Collection.HashSet;

public class Employee {
	String name;
	int id;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	public Employee( int id,String name) {
		super();
		this.name = name;
		this.id = id;
	}

	

}
