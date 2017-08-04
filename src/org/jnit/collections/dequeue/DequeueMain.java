package org.jnit.collections.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
//Deque = double ended queue = insert and remove from both the ends
//Linkedlist and Array deque are implemetations of deque
//ArrayDeque performance is better when used as a stack and faster than linkedlist when used as a  queue
//ArrayDeque internal implementation is an array which grows in size,when size is full a new array is created
//default size of array deque is 16
import java.util.LinkedList;

public class DequeueMain {

	public static void main(String[] args) {
		Deque<String> dq = new LinkedList<>();
		dq.addLast("apple");
		dq.addLast("mango");
		dq.add("orange");
		dq.addFirst("grapes");
		dq.addLast("strawberry");
		dq.remove();//removes elt at head
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		
		Deque<String> adq =  new ArrayDeque<>();
		adq.addLast("apple");
		adq.addLast("mango");
		adq.add("orange");
		adq.addFirst("grapes");
		adq.addLast("strawberry");
		adq.remove();//removes elt at head
		adq.removeFirst();
		adq.removeLast();
		System.out.println(adq);
		System.out.println(adq.getFirst());
		System.out.println(adq.getLast());
		
		for(String string : adq){
			System.out.println(string);
		}
	}

}
