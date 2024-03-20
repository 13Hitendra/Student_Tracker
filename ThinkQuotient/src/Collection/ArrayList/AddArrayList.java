package Collection.ArrayList;

import java.util.ArrayList;

//WAP to use add operation of ArrayList
public class AddArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
      
       System.out.println("Elements in the ArrayList: " + numbers);

        int index = 2;
        int elementToAdd = 25;
        numbers.add(index, elementToAdd);	//adding at specific position.

        System.out.println("ArrayList after adding element at index " + index + ": " + numbers);
    }
}

