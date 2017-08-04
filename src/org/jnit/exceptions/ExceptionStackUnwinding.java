package org.jnit.exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.jnit.objectcommunication.Employee;
public class ExceptionStackUnwinding {
	public static void method1() throws FileNotFoundException{
		int i = 10;
		method2();
	}

	private static void method2() throws FileNotFoundException  {
		String s = "sam";
		Employee e = new Employee();
		method3();
		
		
	}

	private static void method3() throws FileNotFoundException {
		
		FileReader f1 = new FileReader("abc.txt");
		
	}
	//if the exception is never handles,it gets propogated as a runtime exception by JVM
	public static void main(String[] args){ // throws FileNotFoundException {
		try {
			method1();
		} catch (FileNotFoundException e) {
			//If the exception is handled, it shows where the error is as well as continues with execution
			e.printStackTrace();
		}
		System.out.println("My method finished Execution");
	}

}
