package Interface;

public class Normal implements First{
	//if u make class abstract then u dont need to implement all methods of interface.
	
	public static void main(String[] args) {
		
	//	First f=new First();                        //cant make object
		First f1=new Normal();
		f1.print();
		
	//	num=23;				//final cant be re-value.
		System.out.println(num);			//no need to use object . its by default static
	}

	@Override
	public void print() {
		
		System.out.println("print method called");
	}

}
