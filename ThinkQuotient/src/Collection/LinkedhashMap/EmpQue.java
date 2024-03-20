package Collection.LinkedhashMap;

import java.util.Comparator;
import java.util.TreeMap;
/*   Create a class Employee which implements comparable in ascending order.
WAP to create a TreeMap to store the Employee and stores objects in a TreeMap in descending order.*/
public class EmpQue {
    public static void main(String[] args) {
        
        TreeMap<Employee, String> empMap = new TreeMap<>(Comparator.reverseOrder());
        
        empMap.put(new Employee(101, "Sanket"), "Hr");
        empMap.put(new Employee(103, "Nishant"), "Sales");
        empMap.put(new Employee(102, "Sagar"), "Hr");

       
        System.out.println("Employee objects in descending order based on Employee Id:");
        for (Employee employee : empMap.keySet()) {
            System.out.println(employee);
        }
    }
}
