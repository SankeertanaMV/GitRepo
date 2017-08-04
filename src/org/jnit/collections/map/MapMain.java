package org.jnit.collections.map;

import java.util.*;


public class MapMain {
//Map(I)
//HashMap(C) implements Map(I)
//LinkedHashMap extends HashMap
//SortedMap(I) extends Map(I)
//TreeMap implements SortedMap(I)  
	

	public static void main(String[] args) {
		// first one is key
		// second one is value
		// entry = key+value
		//key is the set = we cannot have duplicate keys in our hashmap
		//value is the list = we can have duplicate values
		//it doesn't retain insertion order
		//the default size of hashmap is 16
		//it grows two times of our current size when it 75%(0.75=loadfactor in hashmap) full
		//hashmap underneath it works using an array and a linkedlist
		Map<String, Integer>planets = new HashMap<>();
		planets.put("Mercury", 1);
		planets.put("Venus", 2);
		planets.put("Earth", 3);
		
		Map<String, Integer>ratingsMap = new HashMap<>();
		ratingsMap.put("India", 1);
		ratingsMap.put("Australia", 2);
		ratingsMap.put("South Africa", 3);
		ratingsMap.put("Australia", 7);//when we add a dupe to hashkey map its going to replace the old one
        
		
	System.out.println(ratingsMap.size());
	//access the value bye key
	System.out.println(ratingsMap.get("Australia"));
	System.out.println(ratingsMap);
	
	//whenever we are using our own custome object as a key,we should define on what basis our objects are equal
	//the way we define comparision criteria is using equals and hashcode by overriding equals and hash methods
	//if we dont,then it works on reference comparision
	//another issue we might face if we go with ref comparision is we will not be able to retreive the value with key
	
	Map<Author, String>authorsMap = new HashMap<>();
	Author a1 = new Author("John",25,"111-111-1111","111-10-1111");
	Author a2 = new Author("Mike",26,"111-121-1111","111-11-1111");
	Author a3 = new Author("Peter",27,"111-131-1111","111-12-1111");
	Author a4 = new Author("Robert",28,"111-141-1111","111-13-1111");
	Author a5 = new Author("Robert",28,"111-161-1111","111-13-1111");
	Author a0 = new Author("John",25,"111-151-1111","111-10-1111");
	
	authorsMap.put(a1, "English");
	authorsMap.put(a2, "Spanish");
	authorsMap.put(a3, "French");
	authorsMap.put(a4, "Italian");
	authorsMap.put(a5, "Chinese");
	System.out.println(authorsMap.get(a0));
	System.out.println(authorsMap);
	
	//To iterate over a datastructure
	
	for(Map.Entry<Author,String> entry: authorsMap.entrySet()){
		System.out.println(entry.getValue());
		System.out.println(entry.getKey());
	}
	
	
	
	
	
	
	}

}
