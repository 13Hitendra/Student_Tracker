package LabOops;
/*12 . Design a class to overload a function series() as follows:
(i) double series(double n) with one double argument and returns
 		the sum of the series, sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
(ii) double series(double a, double n) with two double arguments and returns 
		the sum of the series, sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms
*/
public class Overload2 {

	public double series(double n)
	{
		double sum=0;
		for (int i = 1; i <= n; i++) {
            sum =sum+( 1.0 / i);
        }
		return sum;
	}
	
	public double series(double a, double n)
	{
		double sum=0.0;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload2 o1=new Overload2();
		System.out.println(o1.series(123));
	}

}
