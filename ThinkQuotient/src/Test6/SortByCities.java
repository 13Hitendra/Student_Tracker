package Test6;

import java.util.Comparator;

public class SortByCities implements Comparator<Shipment>{
	

	@Override
	
		 public int compare(Shipment o1, Shipment o2) {
		        int cityComparison = o1.addr.City.compareTo(o2.addr.City);
		        if (cityComparison != 0) {
		            return cityComparison;
		        }
		        return o1.shipDate.toString().compareTo(o2.shipDate.toString());
		    }

}
