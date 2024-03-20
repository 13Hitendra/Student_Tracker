package Collection.LinkedhashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Book1 {
	private String title;
	private String author;
	private double price;

	public Book1(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Price: " + price;
	}

	public static void main(String[] args) {
		LinkedHashMap<String, Book1> booksMap = new LinkedHashMap<>();
		booksMap.put("lol", new Book1("Python", "Robert C.", 38.50));
		booksMap.put("lmao", new Book1("HTML", " John Vlissides", 43.19));
		booksMap.put("hihi", new Book1("CSS", "Joshua Bloch", 54.99));
		booksMap.put("haha", new Book1("Java ", "Brian Goetz", 49.99));

		System.out.println("Original LinkedHashMap of Books:");
		for (Map.Entry<String, Book1> entry : booksMap.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}

		BookPriceComparator comparator = new BookPriceComparator();

		LinkedHashMap<String, Book1> sortedBooksMap = sortByComparator(booksMap, comparator);

		System.out.println("----------------------------------");
		System.out.println("Sorted LinkedHashMap of Books by Price:");
		for (Map.Entry<String, Book1> entry : sortedBooksMap.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

	public static LinkedHashMap<String, Book1> sortByComparator(LinkedHashMap<String, Book1> booksMap,
			BookPriceComparator comparator) {
		List<Map.Entry<String, Book1>> list = new LinkedList<>(booksMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Book1>>() {
			@Override
			public int compare(Map.Entry<String, Book1> o1, Map.Entry<String, Book1> o2) {
				return comparator.compare(o1.getValue(), o2.getValue());
			}
		});

		LinkedHashMap<String, Book1> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Book1> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
