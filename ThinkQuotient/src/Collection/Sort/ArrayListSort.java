package Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Hitendra", 25));
        persons.add(new Person("Sanket", 30));
        persons.add(new Person("Nishant", 20));
       

       
        System.out.println("Unsorted ArrayList: " + persons);

        Collections.sort(persons);

        System.out.println("Sorted ArrayList: " + persons);
    }
}

