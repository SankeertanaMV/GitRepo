package org.jnit.collections.listdemo;
import java.util.Comparator;

public class CityComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		return b1.getCity().compareTo(b2.getCity());
	}
	
	

}
