package org.jnit.inheritance;
//Person is a parent class


  
public class Person {
	
	public Person(){
		super(); // calling object class constructor
		System.out.println("Default constructor is being invoked");
		
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	private String name;
    private int age;
    private Address homeAddress = new Address();
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
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public void logIn() {
		System.out.println("Checking in database 1");
		
	}
	public void register() {
		System.out.println("Sending an email to whoever registered");
	}
	
    @Override
	public String toString() {
		return name +" " + age;
		
	}
   // @Override
    //static methods cannot be overridden
	public static void test() {
		//super.test(); // u cannot call parent class static method using super keyword
		Person.test();
		System.out.println("I am inside static method test in Person class");
	}
}
