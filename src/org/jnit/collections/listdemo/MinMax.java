package org.jnit.collections.listdemo;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMax {

	static int minimum(int[] arrNum) {
		int minVal = arrNum[0];
		for(int i=0;i<5;i++){
			if(arrNum[i]<minVal){
				minVal = arrNum[i];
			}
			
		}
		return minVal;

	}

	static int maximum(int[] arrNum) {
		
		int maxVal = arrNum[0];
		for(int i=0;i<5;i++){
			if(arrNum[i]>maxVal){
				maxVal = arrNum[i];
			}
			
		}
		return maxVal;

	}

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[5];
		System.out.println("Enter any 5 integers");
		int sum = 0;
		for (int i = 0; i < 5; i++) {

			arrNum[i] = scan.nextInt();
			sum = sum + arrNum[i];

		}
		System.out.println("The array u provided is:"+Arrays.toString(arrNum));
		System.out.println("Sum of array:"+sum);
		System.out.println("Min value :"+minimum(arrNum));
		System.out.println("Max value:"+maximum(arrNum));
		int maxSum = sum - minimum(arrNum);
		int minSum = sum - maximum(arrNum);
		System.out.println("Result=" +maxSum +" "+minSum);
	}
	
	
	  

}
