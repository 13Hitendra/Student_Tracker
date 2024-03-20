package Abstraction;

public class Square extends Shape{
	double side;
	
	Square(double side)
	{
		this.side=side;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1=new Square(6);
		System.out.println("Area of square is "+s1.area());
		
		Square s2=new Square(12);
		System.out.println("Volume of square is "+s2.volume());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return side*side*side;
	}

}
