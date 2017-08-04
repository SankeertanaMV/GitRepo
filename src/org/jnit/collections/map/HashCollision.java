package org.jnit.collections.map;
import java.util.*;
//Hash Collision is a scenario where two objects has the same hash code
//So all the objects with same hashcode are stored in the same location as a Linkedlist
public class HashCollision {
	
	public static void main(String[] args) {
		Map<String,Integer>testMap = new HashMap<>();
		testMap.put("abcdef", 1);
		testMap.put("abcdfG", 1);
		testMap.put("abcdfH", 1);
		testMap.put("a1", 1);
		testMap.put("a2", 1);
		testMap.put("a3", 1);
		testMap.put("a4", 1);
		testMap.put("a5", 1);
		testMap.put("a6", 1);
		testMap.put("a7", 1);
		testMap.put("a8", 1);
		testMap.put("a9", 1);
		testMap.put("a10", 1);
		testMap.put("a11", 1);
		testMap.put("a12", 1);
		testMap.put("a13", 1);
		testMap.put("a14", 1);
		testMap.put("a15", 1);
		testMap.put("a16", 1);
		testMap.put("a17", 1);
		testMap.put("a18", 1);
		
		//scenario where the first two strings has the same hashcode but they are different
		
		System.out.println("abcdef".hashCode());
		System.out.println("abcdfG".hashCode());
		System.out.println("abcdfH".hashCode());
		
		System.out.println("abcdef".equals("abcdfG"));
		//when we do a get
		//hashmap gets the hashcode of the given key
		
	}
	
	

}
