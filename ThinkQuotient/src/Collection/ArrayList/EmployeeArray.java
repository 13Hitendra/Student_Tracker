package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class EmployeeArray  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Employee>Emp=new ArrayList<>();
		
		Emp.add(new Employee(1,"Ajay",12000,"Development"));
		Emp.add(new Employee(2,"Ankita",45600,"Finance"));
		Emp.add(new Employee(3,"Raj",21000,"Development"));
		Emp.add(new Employee(4,"Reshma",12540,"Finance"));
		
		Iterator <Employee>itr=Emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//find all employee in finance dept
		Iterator <Employee>itr1=Emp.iterator();
		System.out.println("Finance dept employee");
				while(itr1.hasNext())
				{
					Employee e=itr1.next();
					if(e.getDept().equals("Finance"));
					{
						System.out.println(e);
					}
				}
				
	}

}
