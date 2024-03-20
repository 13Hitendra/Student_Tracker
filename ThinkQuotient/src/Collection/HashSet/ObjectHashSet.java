package Collection.HashSet;

import java.util.HashSet;

public class ObjectHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee>emp=new HashSet<>();
		emp.add(new Employee(1,"vijay"));
		emp.add(new Employee(2,"Ajay"));
		emp.add(new Employee(3,"Sarthak"));
		emp.add(new Employee(4,"ravi"));
		
		for (Employee e : emp) {
            System.out.println(e);
        }
	}

}
