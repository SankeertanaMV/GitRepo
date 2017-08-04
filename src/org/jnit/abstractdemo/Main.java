package org.jnit.abstractdemo;

public class Main {

	public static void main(String[] args) {
		//Person p = new Person(); Because person is an abstract class
		Person p1 = new Seller();
		HolidayService s = new Employee();// we can create polymorphic variables using interfaces

	}

}
