package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to print all elements of ArrayList using iterator
public class IteratorUse {

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("Sagar");
        names.add("Sanket");
        names.add("Nishant");
        names.add("Hitendra");

        Iterator<String> iterator = names.iterator();

        System.out.println("Element ArrayList:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
