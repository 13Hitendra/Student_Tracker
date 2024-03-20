package LabOops;

public class mainOverload {

	public static void main(String args)
	{
		System.out.println("main with String");
	}  
	public static void main()
	{
		System.out.println("main without args");
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main("hitendra");
		main();
		System.out.println("This is Original Main method");
	}

}

