package org.jnit.generics;
//Generic methods are Bounded types
public class Btype {
  
//a method which operates only on instances of number or its sub classes
	
	public<U extends Number> void inspect(U u){
		System.out.println(u);	
	}
	
	public void inspectobj(Object obj){	
	}
	//inspect a is a generic method which can take any argument
	
	public<T> void inspecta(T t){
		System.out.println(t);
	}
	
	//a generic method which can take any argument and returns same type of argument
	public<T> T doSomething(T t1,T t2){
		return t1;
	}
	
	//This method can replace the below 2 methods
	public<T> int returnOccurancesCount(T t,T[] array){
		int count = 0;
		for(T e:array){
			if(e.equals(t)){
				count++;
			}
		}
		return count;
	}
	
	public int returnStringOccurances(String searchFor,String[] tosearch){
		int count = 0;
		for(String e: tosearch){
			if(searchFor.equals(e)){
				count++;
			}
		}
		return count;
	}

	public int returnStringOccurances(int searchFor,int[] tosearch){
		int count = 0;
		for(int e: tosearch){
			if(searchFor == e){
				count++;
			}
		}
		return count;
	}
	
}
