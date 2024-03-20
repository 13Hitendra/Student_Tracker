package StringBufffBuild;

public class Buff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("meaega");
		StringBuffer v=new StringBuffer("ssd");
		
		str.append(v);
		System.out.println(str);
		//System.out.println(str.append(v));
		
		System.out.println(str.capacity());
		System.out.println(str.indexOf("e"));
		System.out.println(str.equals(v));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.isEmpty());
		System.out.println(str.length());	//cause it append by v
		
		
	}

}
