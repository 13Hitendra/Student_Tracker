package Collection.ArrayList;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
// compared by price if price is same sorted by ID
	@Override
	public int compare(Book bk1, Book bk2) {
		// TODO Auto-generated method stub
		if (bk1.getPrice() == bk2.getPrice()) {
			return Integer.compare(bk1.getBookId(), bk2.getBookId());
		} else {

			return Double.compare(bk1.getPrice(), bk2.getPrice());
		}

	}

}
