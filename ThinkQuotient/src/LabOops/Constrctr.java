package LabOops;

public class Constrctr {
	String Name;
	int id;
	
	Constrctr(){
		System.out.println("this is default constructor");
		System.out.println("Name : "+Name);
	}
	
	Constrctr(String Name)
	{
		System.out.println("This is parameterised constructor");
		System.out.println("Name : "+Name);
	}
	
	Constrctr(String name, int id)
	{
		
	}
	public void display()
	{
		System.out.println(Name+" "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrctr c=new Constrctr();
		Constrctr c1=new Constrctr("Software");
		Constrctr c2=new Constrctr("Javascript",112);
		c2.display();
		
	}

}
