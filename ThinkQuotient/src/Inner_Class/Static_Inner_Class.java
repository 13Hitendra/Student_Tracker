package Inner_Class;

public class Static_Inner_Class {

	static int data=10;
	
	public void show()
	{
		Inner i=new Inner();
		i.display();
	}
	 static class  Inner{
		 int num=45;
		 
		 public void display()
		 {
			 System.out.println(" data ="+data);
			 System.out.println("number ="+num);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Inner_Class obj=new Static_Inner_Class();
		obj.show();
	}

}
