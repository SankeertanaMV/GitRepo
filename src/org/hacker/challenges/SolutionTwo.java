package org.hacker.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionTwo {

	public static String solTwoUserNm;
	
	public static void main(String[] args) {
		
		SolutionOne solOne=new SolutionOne();
		solOne.setUserName("Sankeertana");
		
		System.out.println(solOne.getUserName());
		SolutionOne solOneDoop=new SolutionOne("ABC","XYZ");
		System.out.println(solOneDoop.getUserName());
		
	}

	/*private static int longestSubString(String string) {
		
		 String digPattern = "[0-9]";
		 Pattern r = Pattern.compile(digPattern);
		 Matcher m = r.matcher(string);
		 String newStr="";
		 int lenght=-1;
		 if(m.find()){
			 newStr= m.replaceAll(" ");
		 }
		 
		 String[] strArr=newStr.split(" ");
		 String uppCasePtrn="[A-Z]";
		 r=Pattern.compile(uppCasePtrn);
		 
		 List<String> pwds =new ArrayList<String>();
		
		 for (String string2 : strArr) {
			 m=r.matcher(string2);
			 if(m.find()){
				 pwds.add(string2);
			 }
		}
		 
		for (String len : pwds) {
			if(len.length()>lenght){
				lenght=len.length();
			}
		}
		return lenght;
		
	}*/

}
