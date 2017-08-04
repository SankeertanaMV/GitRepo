package org.jnit.controlstatements;
import java.util.Scanner;
public class ControlStatements {

	public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	System.out.println("Enter a string:");
	String s=scanner.next();
	System.out.println(s.equals("Hi"));
	//if-elseif else
	//if(exp(exp evaluation should return true or false))
	if(s.equals("Hi")){
	System.out.println("user entered Hi");
	}else if(s.equals("hello")){
		System.out.println("user entered hello");
	}else{
		System.out.println("user entered "+s);
	}
	scanner.close();
	
	}
}

	


