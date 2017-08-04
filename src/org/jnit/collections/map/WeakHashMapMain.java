package org.jnit.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapMain {
//WeakhashMap entries are garbage collected if the keys are no longer referred in the program,for a hashmap we have to explicitly call remove
	
	public static void main(String[] args) {
		Map<String,Object>weakMap = new WeakHashMap<>();
		Map<String,Object>strongMap = new HashMap<>();
		Author a1 = new Author("Ravi",10,"1111111111","111-11-1111");
		String s1 = new String("Ravi_Entry1");
		String s2 = new String("Ravi_Entry2");
		weakMap.put(s1, a1);
		strongMap.put(s2,a1);
		s1 = null;
		s2 = null;
		System.gc();
		System.out.println(weakMap);
		System.out.println(strongMap);
		

	}

}
