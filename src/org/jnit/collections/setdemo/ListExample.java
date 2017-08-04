package org.jnit.collections.setdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	
	

	//{anna,bob,caly,don,emma,fifa,giga,hexa,meta}
	//zeta,meta,dolly,caly,hexa,fifa,jaffa
	public static void main(String[] args) {

		callListMethod();
}

	public static void callListMethod(){
		List<String> firstList = new ArrayList<>();
		String[] arr1= {"anna","bob","caly","don","emma","fifa","giga","hexa","meta"};
		String[] arr2={"zeta","meta","dolly","caly","hexa","fifa","jaffa"};
		
		for (String string : arr1) {
			firstList.add(string);
		}
		
		List<String> secondList = new ArrayList<>();
		
		for (String string : arr2) {
			secondList.add(string);
		}

		//List<String> commonList = new ArrayList<>();
		
		firstList.retainAll( secondList);
		
		System.out.println(firstList);
		
	}
	}