package AbstractInterface_Asign;
/*5)Create an abstract class equipment with an implemented / concrete method fill and an abstract method mix. 
 * Create a class Cement_mixer which is a type of equipment and implements method mix. 
 * Now, add another method pour in the class Cement_mixer. In main method,(Interface)*/
abstract class Equipment{

	abstract void mix() ;	
	
	public void fill() {
		System.out.println("Concrete method in Equipment");
	}
	
}

public class Cement_Mixer extends Equipment{
	

	@Override
	public void mix() {
		// TODO Auto-generated method stub
		System.out.println("Mix method in cement_mixer class");
	}

	public void pour()
	{
		System.out.println("Pour method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cement_Mixer cm=new Cement_Mixer();
		cm.fill();
		cm.mix();
		cm.pour();
		
		System.out.println("-----------------------------------------------");
		
		Equipment e = new Cement_Mixer();
		e.fill();
		e.mix();
	//	e.pour();
	}

}
