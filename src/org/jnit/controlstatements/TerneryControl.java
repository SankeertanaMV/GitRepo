package org.jnit.controlstatements;

import java.util.Scanner;

public class TerneryControl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value of a:");
		int a = scanner.nextInt();
		
		//int a=10;
		int x = (a%2 == 0) ? 5 : 3; 
		
		if(a%2 == 0){
			x = 5;
		}else {
				x = 3;
			}
		System.out.println("value of x is"+x);
		}

	}


