package Abstraction;

public class Circle extends Shape{
	double r;
	
	public Circle(double r)
	{
		this.r=r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle(20.2);
		System.out.println("Area of circle = "+obj.area());
	}

	@Override
	public double area() {
			return 3.4*r*r;
	}

	@Override
	public double volume() {
	
		return 0;
	}

	

}
