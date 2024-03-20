package LabD2;

/*Containment:
Containment relationship means the use of an object of a class as a member of another class. 
Containment is a 'has-a' relation. e.g. an employee 'has-a' joining date.
*/
public class MYDate {

	private int dd,mm,yy;
	
	
	public MYDate() {
		// TODO Auto-generated constructor stub
		System.out.println(" default const of MyDate()");
		dd=mm=yy=0;
	}
	MYDate(int dd,int mm,int yy)
	{
		System.out.println("Parametric const of MyDate");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void showDate()
	{
		System.out.println(dd+"-"+mm+"-"+yy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MYDate md1=new MYDate();
		md1.showDate();
		
		MYDate md2=new MYDate(2, 5, 24);
		md2.showDate();
	}

}
