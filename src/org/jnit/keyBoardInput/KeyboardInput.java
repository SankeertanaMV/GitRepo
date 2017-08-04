package org.jnit.keyBoardInput;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values for a and b");
		a = scanner.nextInt();// to capture the value of a
		b = scanner.nextInt();// to capture the value of b
		System.out.println(a+b);
		scanner.close();
		
		

	}

}
