package org.jnit.encapsulation;

public class Book { 
	public String title;
	public String author;
	private int price;//Accessor methods for price
	String isbn;
	String publisher;
	String seller;
	
	//gets the price of your book object
	public int getPrice() { 
		return price;
	}
	// sets the value for price of the object
	public void setPrice(int price) {  // price here is the value that we are going to pass for the object
		//logic to prevent users from creating an inappropriate value
		if(price > 100){
			System.out.println("price cannot be greater than"+100);
			return;
		}
		this.price = price;
	}

}
