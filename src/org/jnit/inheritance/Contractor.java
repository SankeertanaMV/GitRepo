package org.jnit.inheritance;

public class Contractor extends Person {
	 
     private String contractorId;
     
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	
	public void printContractAgreement() {
		
	}
	
	// We are overriding the method defined in the parent class
	public void logIn() {
		System.out.println("Checking in database 2");
		
	}

}
