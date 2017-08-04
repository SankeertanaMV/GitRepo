package org.jnit.localvariables;

public class LocalVariables {
	int a=10;// instance variables or class levl variables
	int b=20;
	int c=30;

	//local variable which is defined inside a method/block 
	public static void main(String[] args) {
		int a=20;


	}
	public void test1(){
		int c=10;
		System.out.println(a);
		System.out.println(c);//local variable has a precedence over class level variable 
		System.out.println(this.c);//To access class level variable
	}
	public void test2(){
		System.out.println(b);
	}


}
