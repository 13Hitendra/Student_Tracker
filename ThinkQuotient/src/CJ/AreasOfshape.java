package CJ;

public class AreasOfshape {
	double width,length,radius;
	
	public void setData(double a, double b, double c) {
		width=a;
		length=b;
		radius=c;
	}
	
	public void circleArea()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle :"+area);
	}
	
	public void areaRect()
	{
		double rectArea=length*width;
		System.out.println("Rect Area :"+rectArea);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreasOfshape obj=new AreasOfshape();
		obj.setData(12.2, 8.5, 4.2);
		obj.areaRect();
		obj.circleArea();
	}

}
