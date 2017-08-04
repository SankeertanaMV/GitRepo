package org.jnit.collections.listdemo;
//collections class has some utility operations defined as static methods which we can use.ex:sort,frquency,synchronized
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BookMain {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("orange");
		colors.add("green");
		colors.add("blue");
		colors.add("blue");
		
		String[]colorsConvertedArray = (String[]) colors.toArray();//convert list to an array
		List<String>colorslist = Arrays.asList(colorsConvertedArray);//convert array to list
		
		System.out.println(colors);
		System.out.println(Collections.frequency(colors, "blue"));
		
		Collections.sort(colors);
		System.out.println(colors);
		
		Collections.sort(colors, Collections.reverseOrder());
		System.out.println(colors);
		
		
		
		
		
		List<Book> books = new ArrayList<>();
		Book b1 = new Book("a","dietel","lewisville","english");
		Book b2 = new Book("a1","harry","coppel","english");
		Book b3 = new Book("a2","henry","irwing","english");
		Book b4 = new Book("a3","david","plano","english");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		System.out.println(books);
		Collections.sort(books);
		for(Book book : books){
			System.out.println(book);
		}
		
		Collections.sort(books, Collections.reverseOrder());
		System.out.println();
		for(Book book : books){
			System.out.println(book);
		}
		
		Collections.sort(books, new CityComparator());
		System.out.println();
		for(Book book : books){
			System.out.println(book);
		}
		//to make arraylist thread safe
		List<Book>threadsafebookslist = Collections.synchronizedList(books); 
		List<Book> unmodifiablebooks = Collections.unmodifiableList(books);
		//unmodifiablebooks.remove(0);//throws an exception
		
		
		
	}

}
