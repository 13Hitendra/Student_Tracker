package ArrayAssignment;

import Array.ArrayObject;

/*1.	WAP to print the employees from Employee[] array 
 * who has same salary (Create Employee class which has 3 attributes id, name, salary
 *  and add employee objects to your array)
 *  //Accept id from user and show all emp who get same sal has given id*/
class Employee
{
	int id;
	String name;
	double salary;
	
	Employee(){}
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	 
	public String toString()
	{
		return "id-"+id+"   name- "+name+"    salary-"+salary;
	}
	
	public void setData(int a, String b, double c) {
		id=a;
		name=b;
		salary=c;
	}
}

public class ArrayObjectAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee []ee=new Employee[4];		//created array object of Employee class
		ee[0]=new Employee(1, "Ajay", 12500);
		ee[1]=new Employee(2, "Meena", 24600);
		ee[2]=new Employee(3, "Ram", 12500);
		ee[3]=new Employee(4, "ketan", 24600);
		
		for(Employee emp:ee)
		{
			System.out.println(emp);
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<ee.length;i++) {
			for(int j=i+1;j<ee.length;j++)
			{
				if(ee[i].salary==ee[j].salary)
				{
					System.out.println(ee[j].name+"  has same salary  as "+ee[i].name);
				//	break;
				}
			}
		}
	}

}
