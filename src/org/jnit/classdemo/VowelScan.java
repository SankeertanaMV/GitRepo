package org.jnit.classdemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VowelScan {
	
	public static void main(String[] args) {
			//String input = "ORANGE";
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.println("Shifting vowels in this string to the next vowel position: "+input);
			System.out.println("After Shifting: "+scanVowels(input));
		}

		private static String scanVowels(String input) {
				input=input.toLowerCase();
				char[] inpArr = input.toCharArray();
			List<Integer> vowelPositions = new ArrayList<Integer>();
			for (int i=0;i<inpArr.length;i++) {
				
				char c=inpArr[i];
				if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')){
					vowelPositions.add(i);
				}
			}
			char temp;
			for(int j=vowelPositions.size()-1;j>0;j--){
				if(vowelPositions.get(j)!=0){
				temp=inpArr[vowelPositions.get(j)];
				inpArr[vowelPositions.get(j)]=inpArr[vowelPositions.get(j-1)];
				inpArr[vowelPositions.get(j-1)]=temp;
				}else{
					inpArr[inpArr.length-1]=inpArr[0];
				}
			}
			StringBuilder sb = new StringBuilder();
			for (char s : inpArr) {
				sb.append(s);
			}
			return sb.toString();
	 	}
	}


