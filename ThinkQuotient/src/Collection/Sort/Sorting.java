package Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
       
        ArrayList<String> name = new ArrayList<>();
        name.add("Kiran");
        name.add("Ramesh");
        name.add("Anjali");
        name.add("Radhika");
        name.add("Akash");
    
        System.out.println("Unsorted List: " + name);
        
        Collections.sort(name);
        System.out.println("Sorted List: " + name);
    }
}

