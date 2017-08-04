package org.jnit.inheritance;
//A class cannot have more than one parent
public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1 = new Employee();
        e1.setName("Harry");
        e1.setAge(35);
        e1.getHomeAddress().setCity("Warrens");
        e1.getHomeAddress().setZipcode("64093");
        e1.setEmployeeId(1);
        e1.setDesignation("Manager");
        
         
        e1.logIn();
        e1.register();
        System.out.println("----contractor----");
         Contractor c1 = new Contractor();
         c1.setName("Peter");
         c1.setAge(25);
         c1.getHomeAddress().setCity("Kansas");
         c1.getHomeAddress().setZipcode("64094");
         c1.setContractorId("c1234");
         
         c1.logIn();
         c1.printContractAgreement();
         c1.register();
         
         Employee e2 = new Employee(2,"President","Albert",30);
         System.out.println(e2.getAge());
         System.out.println(e2);
         System.out.println(c1);
         
         e1.test();
         Employee.test();
         
         // Upcasting
         // variables p1 and p2 are called polymorphic variables
         Person p1 = e2;
         Person p2 = new Employee();// Upcasting //casting a child object to a parent class ref
         //p2.resign- parent class will not have access to child class's methods
         ((Employee)p2).resignation(); // Downcasting  // Explicitly coverting parent class ref to a child class ref 
         
         Person p3 = new Person();
         // Employee e4 = p3; // u cannot do this
        // Employee e4 = (Employee) p3; // this line throws a class cast exception because the person object we created at line 44 should not have access to Employee methods
	}

}
