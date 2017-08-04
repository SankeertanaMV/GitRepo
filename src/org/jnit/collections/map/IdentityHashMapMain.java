package org.jnit.collections.map;
import java.util.IdentityHashMap;
import java.util.Map;


	//Identity HashMap uses == (Reference equality check)for comparison
	//Identity HashMap uses doesnot use equals or hashcode for comparing keys
	//Identity HashMap uses System.identityHashcode(object) to find the entry for get operations
	//Identity HashMap is faster compared to hashmap as it doesn't have to check for content equality
	//Identity hashmap doesnot require the keys to be immutable as it doesn't use equals or hashcode
	

public class IdentityHashMapMain {

	public static void main(String[] args) {
		Map<String,String>identityMap = new IdentityHashMap<>();
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		identityMap.put(s1, "test");
		identityMap.put(s2, "test1");
		identityMap.put(s3, "test3");
		
		System.out.println(identityMap.size());
		System.out.println(identityMap.get("Hello"));
		System.out.println(identityMap.get(s3));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1.hashCode());

	}

}
