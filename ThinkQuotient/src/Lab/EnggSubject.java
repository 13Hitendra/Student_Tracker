package Lab;

public class EnggSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Q6.WAP to print the engineering subjects for a given branch and year. 
		 * Variable branch specifies the branch - 'C' for CSE, 'E' for ECE, 'M' for Mechanical 
		 * and the year specifies the year 1, 2, 3 or 4. We have used nested switch to print the subjects.
For first year since every branch has same subjects, there is no inner switch.
 But from second year there is an inner switch which prints, different subjects for different branches.*/
		
		char branch='E';
		int year=2;
		
		switch (year) {
			case 1:
				System.out.println("All Subjects are same");
				break;
				
			case 2 :
				switch (branch) {
				case 'C' :
					System.out.println("these are 2nd year CSE subjects");
					break;
				case 'E' :
					System.out.println("these are 2nd year ECE subjects");
					break;
				case 'M' :
					System.out.println("these are 2nd year Mechanical subjects");
					break;
				default :System.out.println("invalid selection");
				}break;
				
			case 3 :
				switch (branch) {
				case 'C' :
					System.out.println(" 3rd year CSE subjects");
					break;
				case 'E' :
					System.out.println("3rd year ECE subjects");
					break;
				case 'M' :
					System.out.println("3rd  year Mechanical subjects");
					break;
				default :System.out.println("invalid selection");
				}break;
				
			case 4 :
				switch (branch) {
				case 'C' :
					System.out.println(" CSE subjects of 4th year");
					break;
				case 'E' :
					System.out.println("ECE subjects of 4th year");
					break;
				case 'M' :
					System.out.println("Mechanical subjects of 4th year");
					break;
				default :System.out.println("invalid selection");
				}
				default :System.out.println("invalid selection");
		}	
		
	}

}
