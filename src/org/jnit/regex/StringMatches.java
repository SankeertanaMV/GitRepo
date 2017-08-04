package org.jnit.regex;
//Pattern matching helps to validate whether a string is in desired format
//example we can validate phone numbers, ssn's etc.,
public class StringMatches {
	
	// \d=any digit([0-9]) \D any non-digit equivalent to [^\d]
	// \w=any word \W any non-word equivalent to [^\w]
	// \s=any white space character \S any non-whitespace character equivalent to [^\s]
	// [a-b][A-B][1-9]
	//{x}-specify no.of occurances
	//{x,y}-occurs between x and y times
	//[^abc]-caret character in regex is not, the patter ^abc is anything other than a,b,c characters
	// . means any character
	// * occurs 0 or more times
	// + occurs one or more times
	// 111-111-1111
	// \ is the escape character
	 public static boolean validatePhoneNumber(String phoneNumber){
		 return phoneNumber.matches("\\{d3}-\\{d3}-\\{d4}");
		 
	 }
	 
	 public static boolean validateSSN(String ssn){
		 return ssn.matches("\\{d3}-\\{d2}-\\{d4}");
	 }
	 
	 public static boolean validateZipCode(String zipcode){
		 return zipcode.matches("\\{d5}");
	 }
	 
	// check if string doesn't start with a number
	 public static boolean checkString(String x){
		 return x.matches("[^\\d].*"); //not of digits., is any character, * is any no.of occurances
	 }
	 
	 public static boolean checkOccurance(String x){
		 return x.matches(".*true.*");
	 }
	 
	 // check if string contains exactly 3 letters
	 
	 public static boolean checkStringThree(String s){
		 return s.matches("[a-zA-Z]{3}");
	 }
	 
	 public static void main(String[] args){
		 System.out.println(validatePhoneNumber("121-121-1211"));
		 System.out.println(validateSSN("414-41-1234"));
		 System.out.println(validateZipCode("64093"));
		 System.out.println(checkString("1abc"));
		 System.out.println(checkString("abc"));
		 System.out.println(checkOccurance("Construe"));
		 System.out.println(checkOccurance("Construction"));
		 System.out.println(checkStringThree("abc"));
		 System.out.println(checkStringThree("abcd"));
				 
		 		
	 }
    
}
