package Collection;

public class Generic<E,T> {
	 E obj;
	 T tj;
	public Generic() {}
	public Generic(E o)//1 parameter
	{
		obj=o;
		tj=null;
	}
	public Generic(E o, T tj)// 2 parameter
	{
		obj=o;
		this.tj=tj;
	}
	
	public E getObject()
	{
		return obj;
	}
	public T getObject1()
	{
		return tj;
	}
	public void showType()
	{
		System.out.println(obj.getClass().getTypeName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer,String> obj=new Generic<>(45);
		int i=obj.getObject();
		obj.showType();
		
		Generic<String,Integer> str=new Generic<>("Java");
		String d=str.getObject();
		str.showType();
		
		Generic<String,Integer> sti=new Generic<String,Integer>("ME",13);
		
		
	}

}
