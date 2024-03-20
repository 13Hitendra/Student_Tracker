package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*Write a Book class with bookId,bookname,author,price , Write appropriate constrcutors ,getter,setter and toString method
 * 1>Sort a book by bookname
 * 2>Sort book by price . if two books are having same price then sort by bookid
 * 3>Count autherwise book*/

public class Book {
	private int bookId;
	private String bookname, authorName;
	private double price;

	public int getBookId() {
		return bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookname=" + bookname + ", authorName=" + authorName + ", price=" + price
				+ "]";
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(int bookId, String bookname, String authorName, double price) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.authorName = authorName;
		this.price = price;
	}

	public int compareTo(Book book) {
		return this.bookname.compareTo(book.getBookname());
	}
	
	static void authorWiseBooks(ArrayList<Book>bl)
	{
		int count;
		for(int i=0;i<bl.size();i++)
		{
			count=0;
			for(int j=0;j<bl.size();j++)
			{
			if((bl.get(i).getAuthorName().equals(bl.get(j).getAuthorName())&& j<i))
				break;
				else if(bl.get(i).getAuthorName().equals(bl.get(j).getAuthorName()))
					count++;
			
			}
			if(count>0)
			{
				System.out.println(bl.get(i).getAuthorName()+"==>"+count+" books   "+"bname==> "+bl.get(i).getBookname());
			}
		}
	}
	
	static void authorWiseBookNames(ArrayList<Book>bl)
	{
		
		for(int i=0;i<bl.size();i++)
		{
			ArrayList<String>books=new ArrayList<>();
			for(int j=0;j<bl.size();j++)
			{
			if((bl.get(i).getAuthorName().equals(bl.get(j).getAuthorName())&& j<i))
				break;
				else if(bl.get(i).getAuthorName().equals(bl.get(j).getAuthorName()))
					books.add(bl.get(j).getBookname());
			
			}
			if(!books.isEmpty())
			{
				System.out.println(bl.get(i).getAuthorName()+bl.get(i).getBookId()+"->"+books);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bk = new ArrayList<>();

		bk.add(new Book(1, "Java", "Mr.Pathak", 500.00));
		bk.add(new Book(2, "Php", "Mr.Chauhan", 750.00));
		bk.add(new Book(3, "Javascript", "Mr.Sharma", 900.00));
		bk.add(new Book(4, "Python", "Mr.Pathak", 500.00));
		bk.add(new Book(5, "HTML", "Mr.Purohit", 504.00));
		bk.add(new Book(6, "CSS", "Mr.Purohit", 804.00));

		System.out.println(bk);

		
	/*	  ArrayList<Book> sortedBooks = new ArrayList<>(); 		//if wanna use comparable uncomment this n implement comparable
		   Iterator<Book> iterator =bk.iterator(); 
		  while (iterator.hasNext()) 
		  {
		   sortedBooks.add(iterator.next());
		  }
		 
		  Collections.sort(bk);
		  
		  System.out.println(bk);		*/
		 

		System.out.println("==========================");

		Collections.sort(bk, new BookComparator());
		System.out.println("Sorted array by price else id");

		for (Book b : bk) {
			System.out.println(b);
		}

		System.out.println("-----------------------------------------");
		// Count authorwise book
		authorWiseBooks(bk);
		System.out.println("==================");
		authorWiseBookNames(bk);
	}

}
