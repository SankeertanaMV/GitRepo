package org.jnit.string;
import java.util.StringTokenizer;
public class StringMain {

	public static void main(String[] args) {
		String s = "hi"; // string literal
		String s1 = new String("hi"); // string object
		
		char[] c = {'h','i'};
		String s2 = new String(c);
		
		char[] c1 = {'m','a','p','p','l','e'};
		String s3 = new String(c1,1,5);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	// String useful methods charAt,length,getChars,startsWith,endsWith,substring,indexOf,toUpperCase,toLowerCase
		
		System.out.println("Character at index 0 is " +s1.charAt(0));
		System.out.println("Length of string is" +s1.length());
		System.out.println("Substring output =" +s3.substring(0, 1));
		
		char[]x = new char[5];
		s3.getChars(0,3,x,0);
		for(char m : x){
			System.out.println(m);
			
		}
		
		String r = "Ravi Kumar";
		String[]cr = r.split(" ");
		for(String crc : cr){
			System.out.println(crc);
		}
	
	System.out.println("starts with output = "+r.startsWith("Ravi"));
	System.out.println("ends with output ="+r.endsWith("Kumar"));
	System.out.println("substring output ="+r.substring(0,3));
	System.out.println("index of output ="+r.indexOf('K'));
	System.out.println("last index of p in apple is"+"apple".lastIndexOf('p'));
	System.out.println("Output of concatenation of hello and world is"+"hello".concat("world"));
	System.out.println("converting int 10 to string output is "+String.valueOf(10));
	
	//String equality check, == , .equals , compareTo
	//== compares references,returns true or false
	//.equals compares contents, returns true or false
	
	String s4 = "hello"; // permgen spaces
	String s5 = "hello"; // here both s4 and s5 points to the same location which has the word hello
	String s0 = "hi";
	String s6 = new String("hello");
	String s7 = s6;
	String s8 = new String("hello");
	// == and .equals
	System.out.println(s6 == s7);//true
	System.out.println(s6 == s8);//false
	System.out.println(s6.equals(s8));//true
	System.out.println(s4 == s5);//true
	System.out.println(s4.equals(s5));//true
	System.out.println(s4.equals(s6));//true
	
	
	//compareTo does a lexicographic comparison(dictionary comparison) based on unicodes and returns0(if equal),
	  // +ve or -ve(A-Z 65to90) and (a-z 97to122)
	
	System.out.println("Comparison of apple to apple is "+"apple".compareTo("apple"));
	System.out.println("Comparison of apple to apply is "+"apple".compareTo("apply")); //ex 20-40=-20
	System.out.println("Comparison of apply to apple is "+"apply".compareTo("apple"));
	
	//regionMatches = check if a part of string matches
	System.out.println("apple".regionMatches(true, 0, "apply", 0, 4));
	System.out.println("String tokenizer output is....");
	StringTokenizer st = new StringTokenizer("this:is:a:Stringtokenizer",":");
	while(st.hasMoreTokens()){
		System.out.println(st.nextToken());
	}
	
	
	
	}

}
