package Collection.HashSet;

import java.util.HashSet;

public class EmptyHashSet {
    public static void main(String[] args) {
        
        HashSet<String> color = new HashSet<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");

        
        System.out.println("HashSet before clearing:");
        System.out.println(color);
  
        color.clear();
        System.out.println("------------------------------");
        System.out.println(color);
    }
}

