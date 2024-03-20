package Inheritance;

class Desktop
{	
	int mouse,totalCost;
	int keyboard;
	String Type; 		//gaming/workstation
	
	Desktop(){}
	
	Desktop(int mouse,int keyboard,String Type)
	{
		this.mouse=mouse;
		this.keyboard=keyboard;
		this.Type=Type;
	}
	public void peripheralsCost()
	{
		 totalCost=mouse+keyboard;
	}
}

class Pcparts extends Desktop
{
	int processor;
	int motherboard;
	String graphicsCard;
	int buildCost;
	
	Pcparts(){}
	
	Pcparts(int mouse,int keyboard,String Type,int processor,int motherboard)
	{
		super(mouse,keyboard,Type);
		this.processor=processor;
		this.motherboard=motherboard;
	}
	public void buildCost()
	{
		buildCost=super.totalCost+processor+motherboard;
		System.out.println("Total Buld Cost is ="+buildCost+"rs");
	}
}

/*class Cost extends Pcparts
{
	
}*/

public class Practise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pcparts pc=new Pcparts(1200,3500,"gaming",15000,6700);
		pc.buildCost();
	}

}
