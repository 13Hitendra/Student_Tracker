package Collection.ArrayList;

import java.util.ArrayList;

public class Remove {

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("Nishant");
        names.add("Hitendra");
        names.add("Sanket");
        names.add("Sagar");

        System.out.println("ArrayList : " + names);

        String nameToRemove = "Nishant";
        names.remove(nameToRemove);

        System.out.println(" after removing '" + nameToRemove + "': " + names);
    }
}

