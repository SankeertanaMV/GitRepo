package org.jnit.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyExample {

	public static void main(String[] args) {
		FileReader f1 = null;
		try {
			f1 = new FileReader("abc.txt");
			//f1.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{ //Instead of closing f1.close() two times in try and catch we are only doing it once in our finally block
					//Is generally used to prevent resource leaks
			try {
				f1.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
			/*try {
				f1.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}*/

	}
	
	static void trywithfinallyExample(){ //if there is no exception involved in some cases u can write try with finally
		try{
			System.out.println("I'm inside try");
		}finally{
			System.out.println("I'm inside finally");
		}
		
	}
	
	//try with resources in java7-it helps us in not writing finally block
	
	public void trywithresources(){
		try (FileReader f1 = new FileReader("abc.txt");
				Connection conn = DriverManager.getConnection("url","username","password");){
			//here f1.close(),conn.close() is called autmatically so that there are no resource leaks
			//f1.close();
			//Most f the clases in java.io package requires cloring ex:filereader,filewriter,bufferreader,bufferwriter,connection,statement
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
