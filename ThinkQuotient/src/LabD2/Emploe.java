package LabD2;
/*4. Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter
*/
public class Emploe {
	private int id,salary;
	private Dept dept;
	private myDate mydate;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public myDate getMydate() {
		return mydate;
	}

	public void setMydate(myDate mydate) {
		this.mydate = mydate;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDate md1=new myDate(12,5,2024);
		Dept d1=new Dept(1212,"Sales");
		
	}

}

//==============================================
class Dept
{
	int deptid;
	String deptName;
	
	public Dept()
	{
		System.out.println("default");
		deptid=0;
		deptName=null;
	}
	
	public Dept(int deptid,String deptname)
	{
		this.deptid=deptid;
		this.deptName=deptname;
	}
	
}
//===============================
class myDate
{
	int day,month,year;
	myDate()
	{
		System.out.println("default");
		day=0;
		month=0;
		year=0;
	}
	myDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
}