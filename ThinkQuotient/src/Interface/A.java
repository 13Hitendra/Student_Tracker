package Interface;

public class A implements MyInterface,CompareInterface{
	int salary;
	public int Employee()
	{
		return salary=1000;
	}
	@Override
	public boolean myCompare(CompareInterface CI) {
		// TODO Auto-generated method stub
		return false;
	}

}
