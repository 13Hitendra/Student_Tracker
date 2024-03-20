package Abstraction;

public class Rectangle extends Shape{
	double length,width,height;
	
	public Rectangle() {}

	public Rectangle(double l,double w)
	{
		this.length=l;
		this.width=w;
	}
	public Rectangle(double l,double w,double h)
	{
		this.length=l;
		this.width=w;
		this.height=h;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(23,45);
		System.out.println("Area of Rect = "+r1.area());
		
		Rectangle r2=new Rectangle(12,23,21);
		System.out.println("voulme of rect = "+r2.volume());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return length*height*width;
	}

}
