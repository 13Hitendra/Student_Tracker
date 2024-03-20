package OOPs;

public class privateAccess {
	private int day;
	private int month,year;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDay(int d) {
		day=d;
	}
	public int getDay() {
		return day;
	}
	
	public void show() {
		System.out.println("day is "+day);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateAccess pa=new privateAccess();
		pa.day=13;
		pa.show();
	}

}
