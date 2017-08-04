package org.jnit.collections.listdemo;

import java.util.Scanner;

public class StairCase1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=i;j++){
				System.out.print("#");
			}
			for(int k=n-1;k>=i-1;k--){
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
