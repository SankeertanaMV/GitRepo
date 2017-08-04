package org.jnit.collections.listdemo;

import java.util.Scanner;

public class TestScan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int arraySize = scan.nextInt();
		System.out.println("Size of array = " + arraySize);
		int[] arrayOfNumbers = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter an element for " +i+ " position");
			arrayOfNumbers[i] = scan.nextInt();
		}

	}
}