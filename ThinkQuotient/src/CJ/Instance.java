package CJ;

public class Instance {
	double r,area;
	
	public void setData(double num) {
		r=num;
		System.out.println("Radius : "+r);
	}
	public void calArea() {
		area=3.14*r*r;
		System.out.println("Area of Circle : "+area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance obj=new Instance();
		obj.setData(3.2);
		obj.calArea();
	}

}
