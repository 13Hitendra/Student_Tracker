package Collection.ArrayList;

import java.util.ArrayList;

public class IndexRetrivel {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Pink");
        list.add("Mango");

        int indexToRetrieve = 2; 
        
        if (indexToRetrieve >= 0 && indexToRetrieve < list.size()) {
            String element = list.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + " : " + element);
        } else {
            System.out.println("Invalid index specified.");
        }
    }
}

