package org.jnit.controlstatements;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter ur age");
		int age=scanner.nextInt();
		checkAge(age);
		System.out.println("Enter ur age");
		age=scanner.nextInt();
		checkAge(age);
		scanner.close();
		
	}
	
	private static void checkAge(int age){
		if (age < 13){
			System.out.println("u r but a weed child");
		}else if(age < 19){
			System.out.println("u r no more a child but a teenager ");
		}
		else{
			if(age < 65){
				System.out.println("u r an adult");
			}
			else{
				System.out.println("u r old now");
			}
		}
	}

}
