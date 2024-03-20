package OOPs;

public class ConstChaning {
	private int dd,mm,yy;
	 ConstChaning()
	 {
		 this(8,6,2025);
	 }
	 ConstChaning(int dd,int mm,int yy)
	 {
	//	 this();
		 this.dd=dd;
		 this.mm=mm;
		 this.yy=yy;
	 }
	 public void show()
	 {
		 System.out.println(dd+"-"+mm+"-"+yy);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstChaning cc=new ConstChaning();
		cc.show();
		
	}

}
