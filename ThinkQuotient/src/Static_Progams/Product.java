package Static_Progams;

public class Product {
//
	int id,quantity,price;
	String prodName;
	static String brand="Logitech";
	static int count=1;
	
	Product(){
		id=count++;
	}
	Product(String prodName,int quantity,int price)
	{
		this();
		this.prodName=prodName;
		this.quantity=quantity;
		this.price=price;	
	}
	public void show()
	{
		System.out.println(id+"  "+prodName+"  "+quantity+"   "+price+"rs");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("g101",10,1200);
		p1.show();
		
		Product p2=new Product("g502",8,999);
		p2.show();
		
		Product p3=new Product("t700",5,450);
		p3.show();
		
	}

}
