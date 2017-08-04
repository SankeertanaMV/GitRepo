package org.jnit.string;

public class StringBufferMain {

	public static void main(String[] args) {
		String s = "hello"; //String class is a final class
		s = s.concat("world"); //the concat operation creates a new string object every time,it doesn't modify
                                //the existing string in memory
		String s2 = s + "world";
		// mutable strings = StringBuffer and StringBuilder(is not thread safe)
		StringBuffer sb = new StringBuffer(10);// 10 here is the initial capacity
		StringBuffer sb1 = new StringBuffer("hi");
		StringBuffer sb2 = new StringBuffer();
		sb1.append("hello friend how are u doing");
		
		System.out.println("sb.capacity");//returns amount of current storage available
		System.out.println("sb.length");
		sb1.setLength(5);//we can shrink the size of stringbuffer by setting the size using setlength
		//sb.setLength(10);//reduce the buffer size to 10
		//System.out.println(sb.toString());
		sb.append("hello");
		sb.ensureCapacity(50);//will increase the capacity to 50
		System.out.println(sb.reverse().toString());
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'g');
		System.out.println(sb);
		
		
		//StringBuilder is not thread safe
		StringBuilder sb3 = new StringBuilder("hi");
		sb3.append("hello friend how are u doing");
		sb3.append("?");
		System.out.println(sb3);
	}

}
