package org.jnit.collections.listdemo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FractionMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int arraySize = scan.nextInt();
		int[] arrayOfNumbers = new int[arraySize];
		
		double positiveFraction = 0;
		double negativeFraction = 0;
		double zeroFraction = 0;
		for (int i = 0; i < arraySize; i++) {
			arrayOfNumbers[i] = scan.nextInt();
			if (arrayOfNumbers[i] > 0)
				positiveFraction += 1;
			else if (arrayOfNumbers[i] < 0)
				negativeFraction += 1;
			else if (arrayOfNumbers[i] == 0)
				zeroFraction += 1;

		}
		
		double n1 = positiveFraction/arraySize;
		double n2 = negativeFraction/arraySize;
		double n3 = zeroFraction/arraySize;  

		System.out.println("Decimal of positive fraction of numbers =" + n1);
		System.out.println("Decimal of negative fraction of numbers =" + n2);
		System.out.println("Decimal of zero fraction of numbers = " + (n3));


	}

}
