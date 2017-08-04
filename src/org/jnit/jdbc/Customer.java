package org.jnit.jdbc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int customerId;
	private String name;
	private String city;
	private String street;
	private String state;
	private String country;
	private String zipcode;
	
	private PhoneInformation phoneInfo;
	private List<Order> orders = new ArrayList<Order>();
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public PhoneInformation getPhoneInfo() {
		return phoneInfo;
	}
	public void setPhoneInfo(PhoneInformation phoneInfo) {
		this.phoneInfo = phoneInfo;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", city=" + city + ", street=" + street
				+ ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + ", phoneInfo=" + phoneInfo
				+ ", orders=" + orders + "]";
	}
	
	

}
