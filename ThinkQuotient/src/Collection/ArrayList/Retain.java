package Collection.ArrayList;
//WAP to retain all elements from ArrayList

import java.util.ArrayList;

public class Retain {

    public static void main(String[] args) {
       
        ArrayList<String> names = new ArrayList<>();

        names.add("Me");
        names.add("You");
        names.add("He");
        names.add("She");
        
        ArrayList<String> elementsToRetain = new ArrayList<>();
        elementsToRetain.add("Me");
        elementsToRetain.add("He");

        System.out.println("ArrayList : " + names);

        names.retainAll(elementsToRetain);

        System.out.println("ArrayList after retaining : " + names);
    }
}
