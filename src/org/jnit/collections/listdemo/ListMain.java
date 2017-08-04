package org.jnit.collections.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//collection of objects also called datastructures 
//collection is toplevel interface
//list and set interfaces extend collection interface
//under list we have arraylist,linkedlist,vectorlist implementing the list interface
public class ListMain {

	public static void main(String[] args) {
		String[] colorsarray = new String[7];
		
		//<> contents inside this are called generics in java,they add compile time safety to ur class
		//we can only add strings to our colors list
		//arraylist is built on top of an array
		//index starts at 0,u can start accesing ur elements using index,we can replace an element using index
		//its an ordered and index based collection
		//list datastructures allow duplicates
		// ur index in textbook resembles the collections in arraylist
		//reindexing happens on removals and additions
		//it starts with size 10 and when it crosses 10 it grows 2 times of its current size(15)
		List<String> colors = new ArrayList<>(); // an arraylist is a dynamically growing array
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("orange");
		colors.add("pink");
		colors.add("green");
		colors.set(5, "black");//change element at a location
		System.out.println("The element at location 0 is " + colors.get(0));//accesing element with an index
		colors.remove(0);
		System.out.println(colors.get(0));
		colors.remove("blue");
		System.out.println(colors.size());
		colors.clear();//it removes all the elements from the datastructure
		
		//we havenot used primitive datatype here rather we used class integer which is a wrapper class for primitive datatype integer
		List<Integer> numbers = new ArrayList<>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		
		List<Character> numberList = new ArrayList<>();
		String x = Integer.toString(10);
		int xint = Integer.parseInt(x);
		int max = Integer.max(10,20);
		
		Double d = Double.parseDouble("10.34");
		
		//Autoboxing and Unboxing
		//Autoboxing-u directly assign ur primitive value to the wrapper class
		
		Integer r  =new Integer(10);
		Integer r1 = 10;//Autoboxing
		int e = r1; //Unboxing//Assigning wrapper class to a primitive class
		
		
		List<String> colorsvector = new Vector<>(); // an arraylist is a dynamically growing array
		colorsvector.add("red");
		colorsvector.add("green");
		colorsvector.add("blue");
		colorsvector.add("orange");
		colorsvector.add("pink");
		colorsvector.add("green");
		colorsvector.set(5, "black");
		
		for(String string : colorsvector) {
			System.out.println(string);
			
		}
		Iterator<String> it = colorsvector.iterator();
		while (it.hasNext()) { //hashnext tells us if there are any more elements to iterate// is a boolean value
			String color = (String) it.next();//tells us the current element at the pointer
			System.out.println(color);
			
			
		}
		

	}

}
