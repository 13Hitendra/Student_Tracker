package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

//WAP to search the specified collection in this collection
public class FindCollection {

    public static void main(String[] args) {
        
        ArrayList<Integer> collection1 = new ArrayList<>();
        collection1.add(10);
        collection1.add(20);
        collection1.add(30);
        collection1.add(40);

        ArrayList<Integer> collection2 = new ArrayList<>();
        collection2.add(20);
        collection2.add(40);

    
        boolean found = collection1.containsAll(collection2);

        if (found) {
            System.out.println("Collection2 is found in Collection1.");
        } else {
            System.out.println("Collection2 is not found in Collection1.");
        }
    }
}

