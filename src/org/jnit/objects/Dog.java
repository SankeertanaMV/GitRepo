package org.jnit.objects;

public class Dog {
	String name;
	String Breed;
	int size;
	int age;
	String color;
	char gender;
	
	//Default constructor // A constructor without any parameters is a default constructor
	//Name of the constructor should be exactly same as the name of the class
	//Constructor doesn't have any return type // Difference b/w a Method and a Constructor
	public Dog(){
		
	}
	
	public void barking(){
		System.out.println(name+" is barking");
	}
 
	public void whining(){
		System.out.println(name+" is whining");
	}
}
