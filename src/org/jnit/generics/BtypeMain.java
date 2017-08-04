package org.jnit.generics;
import org.jnit.objectcommunication.Employee;

public class BtypeMain {

	public static void main(String[] args) {
		Btype bt = new Btype();
		bt.inspect(1);
		//bt.inspect("Hello") //string is not a child of number
		bt.inspecta("hello");
		bt.inspecta(1);
		bt.inspecta(new Employee());
		
		//u pass a string and u get a string
		bt.doSomething("Hi", 1);
		//u pass an integer and u get an integer
		bt.doSomething(1, "Hi");
		
		String[] fruits = {"apple","apple","mango","apple"};
		int appleCount = bt.returnOccurancesCount("apple", fruits);
		
		System.out.println(appleCount);
		
		Integer[]numbers = {1,1,2,3,4,5,1,2};
		int numberCount = bt.returnOccurancesCount(1, numbers);
		System.out.println(numberCount);
		

	}

}
