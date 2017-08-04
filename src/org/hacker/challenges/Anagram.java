package org.hacker.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println(findIndicesSort("aabcdjlklabcd", "bc"));
	}
	public static List<Integer>findIndicesSort(String haystack, String needle){
		List<Integer> anagramIndices=new ArrayList<Integer>();
		char[] haystackChars=haystack.toCharArray();
		char[] needleChars=needle.toCharArray();
		Arrays.sort(needleChars);
		char[] movingWindow;
		for(int i=0;i<haystackChars.length-needleChars.length+1;i++){
			movingWindow=Arrays.copyOfRange(haystackChars,i,i+needleChars.length);
			Arrays.sort(movingWindow);
			if(Arrays.equals( movingWindow, needleChars))
				anagramIndices.add(i);
		}
		return anagramIndices;
		
	}
	
}
