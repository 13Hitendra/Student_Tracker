package Collection.ArrayList;
import java.util.ArrayList;

// check arraylist is empty or not
public class EmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> Car=new ArrayList<>();
		
		Car.add("maruti");
		Car.add("Hyundai");
		
		System.out.println(Car);
		System.out.println("Car ArrayList is Empty = "+Car.isEmpty());
	}

}
