package org.jnit.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jnit.collections.map.Author;


//Exceptions = problems in our programs
//checkedExceptions = compiler checked exceptions,a programmer anticipate them to happen and will provide a proper handler(try/catch) for those
//uncheckedExceptions = runtime exceptions = due to programmer mistake=Indexoutofboundexception, nullpointerexception, classcastexception
//exception hierarchy = toplevel class is throwable and exception and error extends throwable
//a good example of such error is Out of memory error(heap size is full)
//throw-methodbody throws-method signature
//when we are throwing a runtime exception as the part of a method body we dont have to define our throws declaration,
  //but if u r throwing a compiler checked exception,then u need to have ur throws declaration
//Inheritance in exceptions
//finally block-associated with try and catch,which prevents resource leaks-no matter what happens in
  //try and catch block,ur finally executes for sure

public class ExceptionMain {
	static Author a1 = new Author();
	//throw-goes with our method body
	//throw is generally used for bussiness exception
	//throw both checked and unchecked exceptions 
	public static void expectingHello(String val){
		if(!Character.isUpperCase(val.charAt(0))){
			//parent class of our IAE is RTE
			throw new IllegalArgumentException("The value passed doesn't start with an uppercase letter");
		
		}
		System.out.println(val);//this line is not executed
	}
	
	public static void expectingHello1(String val) throws Exception{
		if(!Character.isUpperCase(val.charAt(0))){
			//parent class of our IAE is RTE
			throw new Exception("The value passed doesn't start with an uppercase letter");
		
		}
		System.out.println(val);//this line is not executed
	}
	
	
	//example of checked exception = Filenotfoundexception, SqlException
	//an exception handler can help u recover from the exception
	
	
	public void readFile(){
		try {
			FileReader reader = new FileReader(new File("C:/abc.txt"));
		} catch (FileNotFoundException e) {
				
		
		try{
			FileReader reader = new FileReader(new File("C:/bbc.txt"));
		} catch(FileNotFoundException e1){
			e1.printStackTrace();
			System.out.println("both abc and bbc are not there in C drive");
		}
		e.printStackTrace();
	}
		System.out.println("Completed read file method");
	}
	
	public void connectTodb(){
		try {
			Connection conn = DriverManager.getConnection("url","username","password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//throws is a way of telling the caller of the method that u might get one of the two exceptions and have to provide an exception handler for these	
	public static void connectTodb1() throws SQLException, FileNotFoundException{
		
			Connection conn = DriverManager.getConnection("url","username","password");
			FileReader reader = new FileReader(new File("C:/bbc.txt"));
			
		}
	
	
	
		
	public void readFileandconnectTodb(){
		try{
		FileReader reader = new FileReader(new File("C:/bbc.txt"));
		Connection conn = DriverManager.getConnection("url","username","password");	
	}catch(FileNotFoundException fe){
		fe.printStackTrace();
	} catch (SQLException se){
		se.printStackTrace();
	}
	}
	
	public void readFileandconnectTodbJava7(){
		try{
		FileReader reader = new FileReader(new File("C:/bbc.txt"));
		Connection conn = DriverManager.getConnection("url","username","password");	
	}catch(FileNotFoundException | SQLException e){
		e.printStackTrace();
	} 
	}
	
	//Since exception is the parent class of filenotfound and sqlexceptions
		public void readFileandconnectTodbInheritance(){
			try{
			FileReader reader = new FileReader(new File("C:/bbc.txt"));
			Connection conn = DriverManager.getConnection("url","username","password");	
		}catch(Exception e){
			e.printStackTrace();
		} 
		
	}
	
	

	public static void main(String[] args) {
	String[] colors = new String[4];
	colors[0] = "blue";
	colors[1] = "orange";
	colors[2] = "pink";
	colors[3] = "red";
	
	
	
	try {
		connectTodb1();
	} catch (FileNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	
	
	/*try{
		connectTodbThrows();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
*/
	
	expectingHello("Ravi");
	expectingHello("Test");
	expectingHello("New");
	try {
		expectingHello1("test");//there is a compile time error as the exception is not handled by any method
	} catch (Exception e) {
		try {
			expectingHello1("Test");
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		e.printStackTrace();
	}
	
	
	System.out.println("My program finished execution");
	}
	
}
	
	
	
	

