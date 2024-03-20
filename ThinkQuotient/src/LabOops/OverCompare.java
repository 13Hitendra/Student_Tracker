package LabOops;
/*11. Design a class to overload a function compare( ) as follows:
(a) void compare (int, int) – to compare two integer values and print the greater of the two integers
*/
public class OverCompare {
	
	
	public void compare(char c1,char c2)
	{
		if(c1>c2)
		{
			System.out.println("greater number ="+c1);
		}
		else {
			System.out.println("greater number="+c2);
		}
		
	} 
	
	public void compare(int num1,int num2)
	{
		if(num1>num2)
		{
			System.out.println("greater number ="+num1);
		}
		else {
			System.out.println("greater number="+num2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverCompare oc=new OverCompare();
		oc.compare(12, 45);
		oc.compare('d','f');
		
	}

}
