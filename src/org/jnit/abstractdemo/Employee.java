package org.jnit.abstractdemo;

public class Employee extends Person implements HolidayService, PaymentService {

	@Override
	public boolean logIn() {
		return false;
	}

	@Override
	public void calculateHolidays() {
		
	}

	@Override
	public void calculatePayment() {
		
	}

}
