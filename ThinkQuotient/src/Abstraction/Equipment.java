package Abstraction;
/*5)Create an abstract class equipment with an implemented / concrete method
 *  fill and an abstract method mix. Create a class Cement_mixer which is a type of 
 *  equipment and implements method mix. Now, add another method pour in the class Cement_mixer. 
 *  In main method,(Interface)
a. Create an object of type Cement_mixer and call its fill, mix and pour methods.
b. Create an object of type Cement_mixer with reference variable of Equipment 
(Equipment e = new Cement_mixer). Check the methods available to e.
*/
public abstract class Equipment {
	public void fill()
	{
		System.out.println("Fill method");
	}
	public abstract void mix();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
