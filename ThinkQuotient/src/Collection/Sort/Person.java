package Collection.Sort;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    @Override															// this sort wrt Age.
    public int compareTo(Person nextPerson) {    
        return this.age = nextPerson.age;
    }
    
//    @Override																//this sort wrt Name.
//    public int compareTo(Person otherPerson) {
//        return this.name.compareTo(otherPerson.name);
//    }

    public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
    public String toString() {
        return 
               name+"    "+age+"    "; 
                
    }

	
}

