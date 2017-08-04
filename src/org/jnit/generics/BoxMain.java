package org.jnit.generics;

import java.util.ArrayList;
import java.util.List;

public class BoxMain {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObject("String");
		
		Box b2 = new Box();
		b2.setObject(1);
		
		//int x = (int) b1.getObject();// wrong casting might be possible as we donot know what is there in the box
		
		BoxGeneric<Long> bgl = new BoxGeneric<>();
		bgl.setT(new Long(10));
		//bgl.setT("");
		
		BoxGeneric<String> bg = new BoxGeneric<>();
		bg.setT("Hello");
		
		BoxGeneric<Integer> bgi = new BoxGeneric<>();
		bgi.setT(1);
		
		String s = bg.getT();
		bgl.getT();
		
		System.out.println(bg.getT());
		System.out.println(bgi.getT());
		
		List l = new ArrayList();
		//l here is a raw type,u can add any type of datatype to it
		l.add("apple");
		l.add(new Long(10));
		l.add(new Boolean(false));

	}

}
