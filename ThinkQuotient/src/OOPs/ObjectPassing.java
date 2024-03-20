package OOPs;

public class ObjectPassing {
	private String movieName,releaseYear;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	ObjectPassing(String movieName,String releaseYear)
	{
		this.movieName=movieName;
		this.releaseYear=releaseYear;
	}
	public ObjectPassing checkYr(ObjectPassing op)
	{
		if(this.releaseYear==op.releaseYear)
			return this;
		else 
			return op;
	}
	
	public void show()
	{
		System.out.println("Movie name: "+movieName+"  Release year :"+releaseYear);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectPassing op1=new ObjectPassing("asdf","5692");
		
		ObjectPassing op2=new ObjectPassing("Developement","2025");
		op2.show();
		
		//ObjectPassing op2=op1.checkYr(op);
		
		
	}

}
