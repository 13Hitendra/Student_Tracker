package Array;

import java.util.Arrays;

public class ArrayObject {

	int empid;
	String name;
	double basicsal, netsal;
	static String cname;
	String skills[];

	static {
		System.out.println("in static init block");
		cname = "ThinkQuotient";
	}

	public ArrayObject(int eid, String name, double bsal, String s[]) {
		this.basicsal = bsal;
		this.empid = eid;
		this.name = name;
		this.skills = s;
	}

	public static void changeCname(String nm) {
		cname = nm;
	}

	public void calculateSal() {
		System.out.println("I m in calculateSAl()");
		netsal = basicsal;
	}

	public String toString() {
		return empid + " " + name + " " + basicsal + "  " + netsal + " skills " + Arrays.toString(skills);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayObject[] ao = new ArrayObject[4];

		String s1[] = { "Java", "Angular", "Spring" };
		ao[0] = new ArrayObject(101, "Rakesh", 26000, s1);

		String s2[] = { "Selenium", "Jenkins" };
		ao[1] = new ArrayObject(102, "Ajay", 50000, s2);

		String s3[] = { "Azure", "Oracle Cloud" };
		ao[2] = new ArrayObject(103, "Ramesh", 55000, s3);

		String s4[] = { "Java", "GoogleCloud" };
		ao[3] = new ArrayObject(104, "Meena", 48000, s4);

		for (ArrayObject a : ao) {
			System.out.println(a);
		}
		for (int i = 0; i < ao.length; i++) {
			System.out.println(ao[i]);
		}

		System.out.println("--------------------------");
		for (ArrayObject a : ao) {
			String sk[] = a.skills;
			for (String s : sk) {
				if (s.equals("Spring")) {
					System.out.println(a);
				}
			}
		}
	}
}
