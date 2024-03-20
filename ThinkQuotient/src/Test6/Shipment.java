package Test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*7.	Create List<Shipment>in which sorting is done 
 * according cities and if two order have same cities than according to shipment date(Ascending)
Shipment class (int shipId, String Cust_name, Address addr, MyDate shipDate)
Address class (String addr, String City, String State)
MyDate class  (int dd,mm,yy)
*/

public class Shipment {
	int shipId;
	String Cust_name;
	Address addr;
	MyDate shipDate;
	
	public int getShipId() {
		return shipId;
	}

	public String getCust_name() {
		return Cust_name;
	}

	public Address getAddr() {
		return addr;
	}

	public MyDate getShipDate() {
		return shipDate;
	}

	public Shipment(int shipId, String cust_name, Address addr, MyDate shipDate) {
		super();
		this.shipId = shipId;
		Cust_name = cust_name;
		this.addr = addr;
		this.shipDate = shipDate;
	}

	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", Cust_name=" + Cust_name + ", addr=" + addr + ", shipDate=" + shipDate
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shipment>shipments=new ArrayList<>();
		
		MyDate d1=new MyDate(12,06,24);
		Address a1=new Address("building A","Pune","MH");
		
		MyDate d2=new MyDate(26,11,24);
		Address a2=new Address("Apartment B","Mumbai","MH");
		
		MyDate d3=new MyDate(8,07,24);
		Address a3=new Address("building B","AhmdNagar","MH");
		
		MyDate d4=new MyDate(29,10,24);
		Address a4=new Address("Apartment A","Pune","MH");
		
		shipments.add(new Shipment(1, "Ajay", a4, d4));
		shipments.add(new Shipment(2, "Ajay", a3, d3));
		shipments.add(new Shipment(3, "Ajay", a1, d3));
		shipments.add(new Shipment(4, "Ajay", a2, d1));
		shipments.add(new Shipment(5, "Ajay", a4, d2));
		
		System.out.println("Before sorting:");
        Iterator<Shipment> iterator = shipments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        Collections.sort(shipments, new SortByCities());
        System.out.println("\nAfter sorting:");
        iterator = shipments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
