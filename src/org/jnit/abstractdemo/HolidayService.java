package org.jnit.abstractdemo;
//Interface: Brings unrelated classes together
//An interface can have abstract methods and variables
// variables should only be static or final
//cannot have instace methods or regular variables
public interface HolidayService {
	// All the methods are by default static and abstract in nature
	String HOLIDAY = "Sunday";
	public void calculateHolidays(); // though abstract is not stated here the method is by default abstract

}
