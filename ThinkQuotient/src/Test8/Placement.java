package Test8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Placement{
	public static void main(String[]mkji){
		HashSet<Student>studentSet=new HashSet<>();

		studentSet.add(new Student(1,"SAnket","BCA",2024,true));
		studentSet.add(new Student(2,"Sagar","Comp",2022,false));
		studentSet.add(new Student(3,"Hitendra","Mech",2021,true));
		studentSet.add(new Student(4,"Nishant","Civil",2023,false));

		ArrayList<Student>placedst=new ArrayList<>();
		ArrayList<Student>unplacedst=new ArrayList<>();

		Iterator<Student>iterator=studentSet.iterator();
		while(iterator.hasNext())
		{
			Student student=iterator.next();
			if(student.placed)
			{
				placedst.add(student);
			}else{
				unplacedst.add(student);
			}
			
		}
		
		System.out.println("placed student");
		for(Student student:placedst)
		{
			System.out.println(student);
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("unplaced Student");
		for(Student student: unplacedst)
		{
			System.out.println(student);
		}
		
	}

}

