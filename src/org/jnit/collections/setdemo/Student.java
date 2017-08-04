package org.jnit.collections.setdemo;

public class Student {
	private String firstname;
	private String lastname;
	private String studentId;
	private int age;
	
	public Student(String firstname,String lastname,String studentId,int age){
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentId = studentId;
		this.age = age;
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Define equality criteria=on what basis objects are equal
		//I'm going to take studentid for comparision criteria
		//this refers to the current object which u are trying to add
		//obj refers to the elements already present in the datastructure
		//if we override equals then we have to override hashcode
		Student s = (Student)obj;
		return this.getStudentId().equals(s.getStudentId()) && this.getLastname().equals(getLastname()) ;
	}
	
	@Override
	public int hashCode() { 
		return this.getStudentId().hashCode();
	}
	
	@Override
	public String toString() {
		return firstname + " " + lastname + " " + studentId + " " + age;
	}

}
