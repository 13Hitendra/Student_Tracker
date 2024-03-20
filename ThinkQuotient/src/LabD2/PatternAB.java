package LabD2;

public class PatternAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for (int i=1;i<=n;i++) {
			for (int j=i;j<=n;j++) {
				System.out.print("--");	
				}
			for (int k=1;k<=i;k++) {
				System.out.print("ab ");
			}
			System.out.println();
		}
	}

}
