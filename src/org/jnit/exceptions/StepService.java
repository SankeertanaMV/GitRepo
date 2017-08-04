package org.jnit.exceptions;

public class StepService {
	public static void step1(){
		System.out.println("In step 1");
	}
	
	public static void step2(){
		System.out.println("In step 2");
	}
	
	public static void step3() throws Exception{ //throws Exception{
		System.out.println("In step 3");
		//throw new StepFailedException("An exception happened while executing step3");//provides runtime exception
		throw new Exception("An exception happened at step3");//doesnot provide a runtime exception
	}
	
	public static void step4(){
		System.out.println("In step 4");
	}
	
	public static void main(String[] args) {
		step1();
		step2();
		
		try {
			step3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		step4();
		
	}

}
