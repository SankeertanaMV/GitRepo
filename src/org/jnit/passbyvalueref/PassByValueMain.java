package org.jnit.passbyvalueref;

import org.jnit.encapsulation.Book;
//Pass by value = Passing a copy of the value
//Pass by reference = Passing a copy of the reference - incase of objects
public class PassByValueMain {
        public void add(int a){
			a = a+10;
			System.out.println(a);
		}
		// represented book with fully qualified name
		public void doSomething(Book b1){
			b1.author="paul dietel";
			System.out.println(b1.author);
		}

        public static void main(String[] args) {
	PassByValueMain pm = new PassByValueMain();
	int a = 20;//a here will not be modified
	pm.add(a);// here u r passing a copy of a
	System.out.println("the value of a in main method is"+ a);
	
	Book b = new Book();
	b.author="dietel";
	b.title= "how to program";
	pm.doSomething(b);//it craetes a copy of b and sets it to b1
	System.out.println(b.author);
	
        }
}
