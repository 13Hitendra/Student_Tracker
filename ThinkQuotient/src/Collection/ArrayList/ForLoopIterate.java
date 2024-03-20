package Collection.ArrayList;

import java.util.ArrayList;

public class ForLoopIterate {

    public static void main(String[] args) {
        
        ArrayList<Integer> arList = new ArrayList<>();

        arList.add(10);
        arList.add(20);
        arList.add(30);
        arList.add(40);

        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arList.size(); i++) {
            System.out.println(arList.get(i));
        }
    }
}

