package FileHandling;

public class MyDate {
	int date;

	public MyDate(int date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
}
