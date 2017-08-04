package org.jnit.collections.listdemo;

public class Book implements Comparable<Book>{
     private String id;
     private String author;
     private String city;
     private String language;
     
     
	
	public Book(String id, String author, String city, String language) {
		super();
		this.id = id;
		this.author = author;
		this.city = city;
		this.language = language;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", city=" + city + ", language=" + language + "]";
	}

	@Override
	public int compareTo(Book o) {
		
		return this.getAuthor().compareTo(o.getAuthor());
	}
     
}
