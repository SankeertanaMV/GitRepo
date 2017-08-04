package org.jnit.abstractdemo;

public class Contractor extends Person implements HolidayService, PaymentService{
	@Override
	public boolean logIn() {
		return false;
	}

	@Override
	public void calculateHolidays() {
		
		System.out.println(HolidayService.HOLIDAY);
	}

	@Override
	public void calculatePayment() {
		
	}

}
