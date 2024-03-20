package Abstraction;

public class Cement_Mixer extends Equipment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cement_Mixer cm=new Cement_Mixer();
		cm.mix();
		cm.pour();
		cm.fill();
	}
	
	public void pour()
	{
		System.out.println("Pour method");
	}
	
	@Override
	public void mix() {
		System.out.println("mix abstract method");
	}

}
