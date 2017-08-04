package org.jnit.objectcommunication;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId("1");
		e1.setName("Joe");
		
		Address e1Address = new Address();
		e1Address.setCity("Warres");
		e1Address.setStreet("Maguire");
		e1Address.setZipcode("64093");
		e1Address.setState("MO");
		e1Address.setCountry("USA");
    
		e1.setAddress(e1Address);
		System.out.println(e1.getAddress().getCity());
		Contractor c = new Contractor();
		c.setId("co101");
		c.getAddress().setCity("Parlin");
		c.getAddress().setState("NJ");
		System.out.println(c.getAddress().getState());
		
	}

}
