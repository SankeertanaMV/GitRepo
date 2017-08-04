package org.jnit.basic;

public class HelloWorld {
	
     // main method is the starting point of your program
	//JVM will take care of compiling and running the program
	//compiling - human understandable code to machine code(byte code),interpreting
	public static void main(String[] args) {
		if(args.length > 0){
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		System.out.println("HelloWorld");

	}

}
