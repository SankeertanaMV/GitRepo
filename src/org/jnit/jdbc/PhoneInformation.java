package org.jnit.jdbc;

public class PhoneInformation {
	private String name;
	private PhoneInformation phoneNumber;
	private Customer customer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public PhoneInformation getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneInformation phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
