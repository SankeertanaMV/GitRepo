package org.jnit.polymorphicargsandreturnts;

import org.jnit.abstractdemo.Buyer;
import org.jnit.abstractdemo.Seller;
import org.jnit.abstractdemo.Person;

public class PolymorphicMain {
	 public static void test(Person p){
		 // check what type of object we are receiving using the keyword instance of
		 if(p instanceof Buyer){
			 System.out.println("I'm inside Buyer");
			 ((Buyer) p).buysItem();
		 }else if(p instanceof Seller){
			 System.out.println("I'm inside Seller");
			 ((Seller) p).sellsItem();
		 }
	 }
	 // Polymorphic return types
	 public static Person createBuyer(){
		 return new Buyer();
	 }
	 
	 public static void main(String[] args){
		 Buyer b1 = new Buyer();
		 Seller s1 = new Seller();
		 
		 test(b1);
		 test(s1);
		 
		 Person b = createBuyer();
		 Buyer b2 = (Buyer) createBuyer();// Valid
		//S Seller s2 = (Seller) createBuyer();// Invalid and fails at runtime
		 
	 }
}


