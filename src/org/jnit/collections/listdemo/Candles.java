package org.jnit.collections.listdemo;
import java.util.Scanner;
public class Candles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int tallest = 0;
		int frequency = 0;
		for(int i =0;i<n;i++){
			int height = scan.nextInt();
			scan.close();
			if(height > tallest){
				tallest = height;
				frequency = 1;
			}
			else if(height == tallest)
				frequency++;			
		}
		System.out.println(frequency);
	}
}