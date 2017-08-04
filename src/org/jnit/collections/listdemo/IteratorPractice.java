package org.jnit.collections.listdemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratorPractice {

	public static void main(String[] args){
		List<String>colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("green");
		colors.add("black");
		colors.add("pink");
		/* 
		for(int i=colors.size();i>0;i--){
			System.out.println(i);
		}*/
		
		for(int i=0;true;i++){
			System.out.println(i);
			if(i==107){
				break;
			}
		}
		//create all objects, and do sysout for eaach data type
				//String, int, long, BigDecimal, float, Integer, Long, List,
				//Map, array[int], array[string], double, set
				
				int n = 10;
				char c='s';
				float f =10.2f;
				boolean b=true;
				char[] c1 = new char[10];
				 String name = new String();
				 name = "Sandhya";
				 int[] n1 = new int[10];
				 String[] n2 = new String[20];
				 char[] n3 = new char[20];
				 int x=0;
				 Integer n5 = new Integer("5");
				 long l = 1234567890;
				 BigDecimal b1 = new BigDecimal(0);
				 Long l1 = new Long(1234567890);
				 List<Integer> numbers = new ArrayList<>();
				 
				 for(int i=0;i<numbers.size();i++){
					 System.out.println(numbers.get(i));
				 }
				 
				 
				 		 
				 Map<String,Integer> mp1=new HashMap<>();
				
				 mp1.put("A",1);
				 mp1.put("B",2);
				 mp1.put("C",3);
				 mp1.put("D",4);
				 mp1.put("E",5);

}
}
