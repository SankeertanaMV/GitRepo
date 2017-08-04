package org.jnit.generics;

import java.util.ArrayList;
import java.util.List;

public class PairMain {

	public static void main(String[] args) {
		Pair<String,Integer> p = new Pair<>();
		
		p.setKey("Ravi");
		p.setValue(1);
		
		Pair<Integer,String> p1 = new Pair<>();
		p1.setKey(10);
		p1.setValue("Peter");
		
		System.out.println(p.getKey()+ " " + p.getValue());
		System.out.println(p1.getKey()+ " "+ p1.getValue());
		
		Pair<String,BoxGeneric<Integer>> bp = new Pair<>();
		BoxGeneric<Integer> bgi = new BoxGeneric<>();
		bgi.setT(1);
		
		bp.setKey("Test");
		bp.setValue(bgi);
		
		System.out.println(bp.getKey());
		System.out.println(bp.getValue());
		
		Pair<String,List<String>> ps = new Pair<>();
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("Mango");
		fruitsList.add("apple");
		ps.setKey("Fruits");
		ps.setValue(fruitsList);

	}

}
