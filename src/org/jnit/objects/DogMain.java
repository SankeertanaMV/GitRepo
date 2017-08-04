package org.jnit.objects;

public class DogMain {

	public static void main(String[] args) {
		// Create an object based upon blueprint class
		Dog d1 = new Dog();
		//Dog() here is a constructor 
		//A constructor hepls in constructing an object
		//By default JVM provides default constructor in our class
		d1.age = 2;// dot operator is used to set values 
		d1.Breed = "schewi";//d1,d2,d3 are references controlling your object
		d1.color = "brown";
		d1.name = "zoey" ;
		d1.gender = 'F';
		
		
		Dog d2 = new Dog();
		d2.age = 3;
		d2.Breed = "qui";
		d2.color = "black";
		d2.name = "Ted" ;
		d2.gender = 'M';
		
		Dog d3 = new Dog();
		d3.age = 4;
		d3.Breed = "feo";
		d3.color = "white";
		d3.name = "Rose" ;
		d3.gender = 'M';
       
		System.out.println(d1.name);
		System.out.println(d2.age);
		System.out.println(d3.color);
		d3.barking();
		d1.whining();

	}

}
