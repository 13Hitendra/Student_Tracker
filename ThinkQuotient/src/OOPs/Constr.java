package OOPs;

public class Constr {
// call default constructor
	Constr()
	{
		System.out.println("This is Default Constructor");
	}
	
//parameterized constructor
	Constr(int date,String month,int year)
	{
		System.out.println("Today is : "+date+" "+month+" "+year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constr cst=new Constr();
		Constr cst2=new Constr(13,"Feb",2024);

		
	}

}
