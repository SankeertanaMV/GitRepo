package org.jnit.inheritance;

public class Employee extends Person{
	
    public Employee() {
    	super(); // Invocation of parent class constructor
	
	}
    //From child class constructor we can call parent class constructor
    public Employee(int employeeId,String designation,String name,int age){
    	super(name,age); // Invoking parent class constructor which takes two arguments // Constructor call must be the first statement in a constructor
    	this.employeeId = employeeId;
    	this.designation = designation;
    	
    }
	private int employeeId;
    private String designation;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void register() {
		super.register();
		System.out.println("Sending an email to HR");
	}
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+employeeId + " " + designation;
	}
	
	public static void test() {
		System.out.println("I am inside static method test in Employee class");
	}
	public void resignation() {
		// TODO Auto-generated method stub
		
	}
}
