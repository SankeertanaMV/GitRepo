package org.jnit.controlstatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a color");
	String color=scanner.next();
	 
	switch(color){
	//switch(value) case1: case2:
	case "black":
		System.out.println("U entered black");
		break;
	case "red":
		System.out.println("U entered red");
		break;
	 default:
		 System.out.println("Neither black nor red");
		 break;
		 
		
		
	}
	System.out.println("enter the number of the month:");
	int month=scanner.nextInt();
	int year=2000;
	int numDays=0;
	switch (month) {
	case 1: case 3: case 5: 
	case 7: case 8: case 10: case 12:
		numDays=31;
		break;
	case 4: case 6: case 9: case 11:
		numDays=30;
		break;
	case 2://leap years
		if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
			numDays = 29;
		else
			numDays = 28;
		break;
		default:
			System.out.println("Invalid month");
			break;
	}
	System.out.println("num of days="+numDays);
	scanner.close();
		
	}
	
	
	}


