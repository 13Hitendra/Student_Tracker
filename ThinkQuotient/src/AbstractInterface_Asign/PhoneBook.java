package AbstractInterface_Asign;
/*1)You have to build a phone book. The phone book has the name and contact of a person.
 *  This is an openly accessible book so it should be designed accordingly.
Public
*/

public class PhoneBook {
	
	public String name;
	public double contactNo;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook pb =new PhoneBook();
		pb.name="ThatsMe";
		System.out.println(pb.name);
	}

}
