package org.jnit.collections.listdemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
		
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number of long integers you want to add: ");
		int num=scan.nextInt();
		List<Long> numsList  = new ArrayList<>();
		List<String> names = null;
		List<Integer> rollNums= null;
		List<BigDecimal> percents= null;
		List<Object> listOfLists=new ArrayList<>();
		
		listOfLists.add(names);
		
		
		
		System.out.println("Please enter "+num+" numbers you want to add: ");
		for(int i=0;i<num;i++){
			long longNum=scan.nextLong();
			numsList.add(longNum);
		}
		long result=callAddArrayOfNums(numsList);
		System.out.println("Sum of above numbers is: "+result);
	}
	
	public static long callAddArrayOfNums(List<Long> numsList){
		
		long result=0L;
		
		for(int index=0;index<numsList.size();index++){
			result=result+numsList.get(index);
		}
		
		result=result+numsList.size();
		return result;
		
	}
	
}

	
		

    
         	
       
