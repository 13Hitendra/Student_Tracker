package Test8;

class Candidate implements Comparable<Candidate>{
	int cid,m1,m2,m3;
	String cname;
	double percentage;

	public Candidate(int cid,String cname,int m1,int m2,int m3)
	{
		this.cid=cid;
		this.cname=cname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.percentage=calPercentage();
	}

	public double calPercentage(){
		return (m1+m2+m3)/3.0;
	}

	public String toString()
	{
		return "cid ="+cid+"  cname="+cname+"  percentage="+percentage;
	}

	public int compareTo(Candidate other)
	{
		return Double.compare(other.percentage, this.percentage);
	}
}
