package org.jnit.collections.listdemo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the order of matrix:");
		int order = scan.nextInt();
		int [][] matrix = new int[order][order];
		for(int i=0;i<order;i++){
			for(int j=0;j<order;j++){
				System.out.println("Enter element for: "+i+"row and "+j+" column");
				matrix[i][j] = scan.nextInt();	
			}
		}
		
		int sumOfDiagnolVals=callAddMatrixDiagnols(matrix);
		System.out.println(sumOfDiagnolVals);
	}

	private static int callAddMatrixDiagnols(int[][] matrix) {
		int result = 0;
		int num = 0;
		int num1 = 0;
		int ord=matrix.length-1;
		
					for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix.length;j++){
							if(i==j){
								 num = num + matrix[i][j];		
				}if(i+j==(ord)){
					 num1 = num1 + matrix[i][j];
					}
						
			}	
		}
					int dif = (num-num1);
					return result;

	}
}

		
			

	
		
	


