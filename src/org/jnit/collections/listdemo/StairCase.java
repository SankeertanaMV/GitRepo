package org.jnit.collections.listdemo;

import java.io.*;
import java.util.*;

public class StairCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("#");
            }
            System.out.println();
        }
        
    }
}
