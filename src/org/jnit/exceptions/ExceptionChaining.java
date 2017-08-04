package org.jnit.exceptions;
// A method responds by throwing a new exception
//Throwing a new exception while enclosing the previously happened exception makes the exception chaining possible
//if we dont prefrom exception chaining while throwing a new exception,then previous exception will be lost

public class ExceptionChaining {
	
	public static void method1() throws Exception{
		try {
			method2();
			
		} catch (Exception e) {
			throw new Exception("An error occured in method1, e");
			
		}
	}
	
    public static void method2() throws Exception{
    	try{
    	method3();
    	} catch (Exception e){
			throw new Exception("An error occured in method2, e");
		}
    }
	
    
    public static void method3() throws Exception{
		throw new Exception("An error occured in method3");
	}
    
    public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
