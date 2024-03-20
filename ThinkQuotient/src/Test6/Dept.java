package Test6;

public class Dept {
	String deptName;
	
		public String getDeptName() {
		return deptName;
	}

	@Override
		public String toString() {
			return "Dept [deptName=" + deptName + "]";
		}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

		public Dept(String deptName)
		{
			this.deptName=deptName;
		}
		
		
		

}
