package Inheritance;

public class Car extends Vehicle {
	int price;
	String colour;
	
	Car()
	{
		price=0;
		colour="white";
	}
	Car(int regNo,String model,int price,String colour)
	{
		super();
		this.price=price;
		this.colour=colour;
	}
	public String toString()
	{
		return super.toString()+"  -  "+price+"  -  "+colour;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		System.out.println(c);
		
		Car c1=new Car(4545,"z900",560000,"Green");
		System.out.println(c1);
	}

}
