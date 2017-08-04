package org.jnit.encapsulation;

public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
			b1.author  = "Dietel";
			//b1.price = 35;// We cannot directly access the price 
			b1.setPrice(35);
			b1.publisher = "pegion";
			 b1.title = "How to program";
			 b1.seller = "john";
			 
			 Book b2 = new Book();
				b2.author  = "Dietel";
				//b2.price = 350;
				b2.setPrice(350);
				b2.publisher = "pegion";
				 b2.title = "How to program";
				 b2.seller = "mike";
				 
				 System.out.println(b1.getPrice());
				 System.out.println(b2.getPrice());
					 
		}

	}


