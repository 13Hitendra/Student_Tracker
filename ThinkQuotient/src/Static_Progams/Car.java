package Static_Progams;
/*2>Write a Car class with following datamember
model,price,fueltype,registrationnumber,
static datamember : totalSales,toRevenue
Write appropriate constructors ,methods - show ,sales
static method :getTotalSales,getTotalRevenue 
Write main method -create Car class object ,invoke sales method .
call getTotalRevenue and getTotalSales method to find total sales and revenue.*/

public class Car {
	int price,regNumber;
	String model,fuelType;
	static double totalSales=1,toRevenue=0;
	
	
	Car()
	{
		
	}
	Car(String model,String fuelType,int price,int regNumber)
	{
		this.model=model;
		this.fuelType=fuelType;
		this.price=price;
		this.regNumber=regNumber;
		toRevenue=toRevenue+price;
	}
	
	static void getTotalSales()
	{
		totalSales++;
		System.out.println("Total Cars sold ="+totalSales);
	}
	
	static void getTotalRevenue()
	{
		System.out.println("Total Revenue ="+toRevenue);
	}
	
	public void Sales()
	{
		Car.getTotalSales();
		
	}
	
	public void show()
	{
		System.out.println("*Model : "+model+"     Fuel Type : "+fuelType);
		System.out.println("Price : "+price+"   Register Number : "+regNumber);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Car c1=new Car("suv","petrol",1000,236589);
		c1.show();
		Car c2=new Car("sedan","disel",5000,1452);
		c2.show();
		Car.getTotalSales();
		Car.getTotalRevenue();
		
		
	}

}
