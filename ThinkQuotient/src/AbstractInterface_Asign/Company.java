package AbstractInterface_Asign;
/*6) A company has employees and wants to keep a track of their names, id and hours of work. 
 * The employees are specifically categorised into part-time and full-time. 
 * Salary needs to be calculated for both however, where part-time employees get 200 rs. 
 * Per hour and Full-time employees get 500 rs. per hour. Write a program which does the same.*/
abstract class Employee
{	
	String name;
	int id;
	float hrs;
	
	Employee(String name,int id,float hrs){
		this.name=name;
		this.id=id;
		this.hrs=hrs;
	}
	
	abstract double calcSalary();
}


public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partTimeEmp pte=new partTimeEmp("Ajay",12,8);
		FullTimeEmp fte=new FullTimeEmp("Sarang",13,6);
		
		System.out.println("name="+pte.name+"    id="+pte.id+"    salary="+pte.calcSalary());
		System.out.println("name="+fte.name+"    id="+fte.id+"    salary="+fte.calcSalary());
		
	}

}
