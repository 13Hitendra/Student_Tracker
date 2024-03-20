package Collection.LinkedhashMap;

import java.util.*;


class BookPriceComparator implements Comparator<Book1> {
	@Override
	public int compare(Book1 b1, Book1 b2) {
		return Double.compare(b1.getPrice(), b2.getPrice());
	}
}
