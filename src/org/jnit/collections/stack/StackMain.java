package org.jnit.collections.stack;

import java.util.Stack;

public class StackMain {
// Stack extends Vector
//LIFO=Last inserted elt is the one which comes out first
//push is a way to put elts into stack
//pop is a way to remove elts from the stack
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
		s.push("Apple");
		s.push("Orange");
		s.push("Mango");
		s.push("Pineapple");
		
		for(String st : s){
			System.out.println(st);
		}
		
		System.out.println(s.peek());//prints elts at the top of the stack
		System.out.println(s.pop());//removes elt at the top of the stack
		System.out.println(s.empty());//checks if stack is empty
		System.out.println(s);//prints the entire stack
		System.out.println(s.get(0));//elt at a particular index
		System.out.println(s.remove("Apple"));
		System.out.println(s);

	}

}
