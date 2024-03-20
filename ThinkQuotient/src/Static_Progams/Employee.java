package Static_Progams;

public class Employee {
		private int eid;
		private String name;
		private double sal;
		private static String C_name="ThinkQuotient";
		
		static {
			System.out.println("im in static block");
			C_name="TCS";
		}
		
		public Employee(){
			
		}
		
		public Employee(int eid,String nm,double sal)
		{
			this.eid=eid;
			this.name=nm;
			this.sal=sal;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
