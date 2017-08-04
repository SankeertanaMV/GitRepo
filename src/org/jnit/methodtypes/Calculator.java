package org.jnit.methodtypes;
// Different method types in java
//A method which doesn't return a value


public class Calculator {
	//A method which doesn't return a value
      static void print(){
    	  System.out.println("This class is a caluculator class");
      }
      
      
      static String PrintSomething(){
    	  return "This class is a caluculator class and prints Something";//this is a string
      }
     
      //Method which takes arguments and return a value
      //a method return only a value
      static int add(int x , int y){  //x,y are parameters
    	  return x+y;//return type should match with the datatype being returned
      }
      
      //Method which takes arguments but doesn't  return anything
      static void addition(int x , int y){
    	 System.out.println(x+y);//return type should match with the datatype being returned
      }
      
      static void doSomething(int x,int y,String z,boolean f){
    	  
      }
      public static void main(String args[]){
    	  print();//main method is the caller
    	  PrintSomething();
    	  String value=PrintSomething();
    	  System.out.println(value);
    	  int val=add(10,20);//10,20 are arguments
    	  val=val*10;
    	  System.out.println(val);
    	  addition(10,20);
    	  doSomething(10,20,"hi",true);
    	  
      }
}
