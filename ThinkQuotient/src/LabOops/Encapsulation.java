package LabOops;

public class Encapsulation {
	private int Number;
	private String Name;
	
	public void setNumber(int number)
	{
		Number=number;
	}
	public int getNumber()
	{
		return Number;
	}
	
	public void setName(String name)
	{
		Name=name;
	}
	public String getName()
	{
		return Name;
	}
	
	public void show() {
		System.out.println("Number="+Number+"  Name="+Name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ec=new Encapsulation();
		ec.setNumber(12);
		ec.setName("Somebody");
		ec.show();
		
	}

}
