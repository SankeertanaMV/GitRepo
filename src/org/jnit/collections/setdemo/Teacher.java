package org.jnit.collections.setdemo;

import java.util.Comparator;

//Parent interface of a Tree set is a Sorted set

public class Teacher implements Comparable<Teacher>{
	private String firstname;
	private String lastname;
	private String subject;
	
	public Teacher(String firstname, String lastname, String subject) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.subject = subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public int compareTo(Teacher t) {
		int val = this.getSubject().compareTo(t.getSubject());	
		if(val == 0){
			return this.getLastname().compareTo(t.lastname);
		}else
			return val;
		
	}

	@Override
	public String toString() {
		return "Teacher [firstname=" + firstname + ", lastname=" + lastname + ", subject=" + subject + "]";
	}
	
	
	}
	


