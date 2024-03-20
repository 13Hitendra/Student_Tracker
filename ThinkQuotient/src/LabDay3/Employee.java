package LabDay3;



/*4. Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter
*/
public class Employee {
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

	public void show()
	{
		System.out.println("id ="+id+"   salary="+salary);
		System.out.println();
		mydate.showmyDate();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDate md1=new myDate(12,5,2024);    //obj of myDate class
		Dept d1=new Dept(1212,"Sales");   				//obj of dept class
		md1.showmyDate();
		d1.showDept();
		System.out.println("============");
		
		Employee em1=new Employee();
		em1.setId(999);
		em1.setSalary(45000);
		em1.setMydate(new myDate(9,2,2024));		//value set in mydate class through employee class
		em1.show();
		
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
	
	public void showDept()
	{
		System.out.println("id="+deptid+"  dept name ="+deptName);
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
	
	public void showmyDate()
	{
		System.out.println("mydate ="+day+"-"+month+ "-"+year);
	}
	
}
