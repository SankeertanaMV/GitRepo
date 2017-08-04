package org.jnit.abstractdemo;
// an abstract class can have abstract methods
// an abstract method is a method which doesn't have any body
// we create an abstract class so that the child class extending the abstract class has to provide implementation
public abstract class Person {
	public Person(){ // even though u have a constructor, u cannot invoke it
		
	}
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
   public abstract boolean logIn();
   
   public void logout(){
	   
   }
	   
   
}
