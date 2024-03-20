package Collection;

public class NonGeneric {

	Object obj;
	public NonGeneric()
	{
		
	}
	public NonGeneric(Object o)
	{
		obj=o;
	}
	public void showType()
	{
		System.out.println(obj.getClass().getTypeName());
	}
	public Object getObject() {
		// TODO Auto-generated method stub
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGeneric obj=new NonGeneric(45);
		obj.showType();
		int i=(int) obj.getObject();
		
		NonGeneric obj1=new NonGeneric("Java");	
		obj1.showType();
		String str=(String) obj1.getObject();
		obj=obj1;			// no compile time error botht belonging to same class
		int ii=(int) obj.getObject();	//runtime exception ClassCastException
		
	}
	

}
