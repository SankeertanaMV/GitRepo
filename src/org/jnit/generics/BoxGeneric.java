package org.jnit.generics;

// T is the type and boxgeneric can accept any datatype
// T stands for type
// K,V=Key, Value
// N = number
// E = element

public class BoxGeneric<T> { //BoxGeneric<Object>
	private T t; //Object t = type Erasure

	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public String toString(){
		return t.toString();
	}
	
}
