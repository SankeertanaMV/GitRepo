package org.jnit.enumdemo;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setName("Rahil");
		c1.setAge(30);
		c1.getOrder().setStatus(OrderStatus.PLACED);
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getOrder().getStatus());

	}

}
