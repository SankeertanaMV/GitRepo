package org.jnit.datatypes;
//Datatypes for our members/variables
//8 primitive datatypes
//Numeric datatypes - Integral datatypes and Floating point numbers
//Integral datatypes-byte
                   //short
                   //int
                   //long
//Decimal datatypes-float
                  //double
//Boolean datatypes-boolean-true or false
//Character datatypes-char-represents single characters
public class DataTypeDemo {
byte b=127;
int i=10;
short s=50;
long r=30000;
float w=10.2f;
double e=13.987;
boolean bool= true;
char c='o';
int b_i = b; //implicit casting
int t = 10;
byte q = (byte)t;
public static void main(String args[]){
	int i=250;
	int t=10;
	byte i_b=(byte) i ; //explicit casting in java
	byte q = (byte)t;
	System.out.println(q);
	System.out.println(i_b);
}




}
