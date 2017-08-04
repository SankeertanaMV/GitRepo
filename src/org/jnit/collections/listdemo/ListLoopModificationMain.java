package org.jnit.collections.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//add -for-each-CME,iterator = CME,list-iterator-add=no issues
//remove -for-each=re-indexing, iterator = preferred(no re-indexing during iteration)
//update -for-each - no issues,iterator = no issues,we can update
//read - for-each,iterator = no issues, we can read


public class ListLoopModificationMain {

	public static void main(String[] args) {
		//crud = create(add) , read , update , dalete(remove)
		
		List<String>colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		//add an element when looping with for each-Current Modification Exception
		/*for(String b:colors){
			System.out.println(b);
			if(b.equals("red"))
				colors.add("blue");//this program is going to fail showing CME beacue u are tring to modify the datastructure while iterating over it
		}*/
		
		//for removing an element-there is a chance of re-indexing and hence is not the safest method
		/*for(String b:colors){
			System.out.println(b);
			if(b.equals("red"))
				colors.remove(b);
		}*/
		// colors.add("blue");
		
		//add an element while looping with iterator = concurrent modification exception
		//using iterator interface
		/*Iterator<String>colorsIterator1 = colors.listIterator();
		while(colorsIterator1.hasNext()){
			String color = colorsIterator1.next();
			System.out.println(color);
			if(color.equals("red"))
				colors.add("blue");//this fails again due to CME
			
		}*/
		
		//Iterator is safe for removing an element as there will  be no re-indexing
		/*Iterator<String>colorsIterator1 = colors.listIterator();
		while(colorsIterator1.hasNext()){
			String color = colorsIterator1.next();
			System.out.println(color);
			if(color.equals("red"))
				colorsIterator1.remove();//this fails again due to CME
			
		}*/
		System.out.println(colors.size());
		
		//updating an element using for-each with no issues
		for(String b:colors){
			System.out.println(b);
			if(b.equals("red"))
				colors.set(0,"pink");
		}
		System.out.println(colors);
		
		//update an element while looping with iterator = no issues
		Iterator<String>colorsIterator1 = colors.listIterator();
		while(colorsIterator1.hasNext()){
			String color = colorsIterator1.next();
			System.out.println(color);
			if(color.equals("green"))
				colors.set(1,"black");//this fails again due to CME
			
		}
		System.out.println(colors);
		
		
		//ListIterator is bi-directional iterator, u  can loop over from any end 
		//List iterator comes under fail safe iterator
		/*ListIterator<String>colorsIterator = colors.listIterator();
		while(colorsIterator.hasNext()){
			String color = colorsIterator.next();
			System.out.println(color);
			if(color.equals("red"))
				colorsIterator.add("blue");
		}*/
		
		/*ListIterator<String>colorsBackwardIterator = colors.listIterator(colors.size());
		while(colorsBackwardIterator.hasPrevious()){
			String color = colorsBackwardIterator.previous();
			System.out.println(color);
			if(color.equals("red"))
				colorsBackwardIterator.add("blue");
		}*/

	}

}
