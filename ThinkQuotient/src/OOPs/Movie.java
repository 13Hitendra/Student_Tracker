package OOPs;

public class Movie {
	
	private int id,duration,releaseYear;
	private String movieName,language,category;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	public int getDuration()
	{
		return duration;
	}
	public void setReleaseYear(int releaseYear)
	{
		this.releaseYear=releaseYear;
	}
	public int getReleaseYear()
	{
		return releaseYear;
	}
	
	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setLanguage(String language)
	{
		this.language=language;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public String getCategory()
	{
		return category;
	}
	
	
	Movie()
	{
		
	}
	
	Movie(int id,int duration,int releaseYear, String movieName,String language,String category )
	{
		this.id=id;
		this.duration=duration;
		this.releaseYear=releaseYear;
		this.movieName=movieName;
		this.language=language;
		this.category=category;
	}
	public void Display()
	{
		System.out.println(id);
		System.out.println(duration);
		System.out.println(releaseYear);
		System.out.println(movieName);
		System.out.println(category);
		System.out.println(language);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie();
		m.setId(111);
		m.setDuration(120);
		m.setReleaseYear(2024);
		m.setMovieName("ThinkQuotient");
		m.setCategory("Education");
		m.setLanguage("English");
		
		System.out.println(m.getId());
		System.out.println(m.getDuration());
		System.out.println(m.getReleaseYear());
		System.out.println(m.getMovieName());
		System.out.println(m.getCategory());
		System.out.println(m.getLanguage());
		
		Movie m1=new Movie(222,180,2025,"Python","Coding","English");
		m1.Display();
		
		
		
	}

}
