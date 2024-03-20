package Containment;

class Author
{
	private int authorId;
	private String authorName, email;
	
	public void setAuthorId(int authorId)
	{
		this.authorId=authorId;
	}
	public int getAuthorId()
	{
		return authorId;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmial()
	{
		return email;
	}
	Author()
	{
		//dfault constrctr
	}
	Author(int authorId,String authorName,String email)
	{
		this.authorId=authorId;
		this.authorName=authorName;
		this.email=email;
	}
	public void showData()
	{
		System.out.println("Author Id : "+authorId);
		System.out.println("Author NAme : "+authorName);
		System.out.println("Email : "+email);
	}
	
}
