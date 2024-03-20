package Collection.ArrayList;

import java.util.ArrayList;

public class RemoveAll {
//WAP to remove all elements from ArrayList
    public static void main(String[] args) {
       
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        System.out.println("ArrayList : " + names);

        names.clear();

        System.out.println("after removing all elements: " + names);
    }
}

