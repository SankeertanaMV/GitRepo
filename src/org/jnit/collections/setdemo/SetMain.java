package org.jnit.collections.setdemo;
import java.util.Iterator;
//Collections-I
//Set(I) extends Collections(I)
//HashSet(C) implements Set(I)
//LinkedHashSet(C) extends HashSet(C)
//SortedSet(I) extends Set(I)
//TreeSet(C) implements SortedSet(I)
//Set doesn't maintain an insertion order


import java.awt.FontFormatException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;



public class SetMain {

	public static void main(String[] args) {
		Set<String>colors = new HashSet<>();
		colors.add("red");
		colors.add("brown");
		colors.add("pink");
		colors.add("red");
System.out.println(colors.size());
System.out.println(colors);
//colors.get(0);//no indexing for sets
//by default set does a == comparision


     Set<Student>students = new HashSet<>();
    // Set<Student>studentsl = new LinkedHashSet<>(); Linkedhashset,add functions and everything is same as HashSet
     
     
     Student s1 = new Student("Micheal","Frank","ios",20);
     Student s2 = new Student("Mich","Fr","android",21);
     Student s3 = new Student("Ted","Mosby","Chrome",22);
     Student s4 = new Student("Lily","Marshal","google",23);
     Student s6 = new Student("Micheal","Frankly","ios",20);// s6 is not printed again as it is a dupe of s1
     
     Student s5 = s4;//s5 here points to the same object as s4
       
     students.add(s1);
     students.add(s2);
     students.add(s3);
     students.add(s4);
     students.add(s5);
     students.add(s6);
     
     System.out.println(students);
     System.out.println(students.size());
     System.out.println(s1.equals(s2)); //both the functions are same. both determine reference equality
     System.out.println(s4 == s5);
     
     //In order to check for the contents of the objects, we have to create our own equals method
     //For the set to compare the contents of ur objects,u need to define ur equals method and hashcode method
   //How set works?
 	//it calls the hashcode method first and check to see if the two objects has the same hashcode
     //if two objects has the same hashcode,it calls equals to make sure if they are really equal
     //if two objects has the different hashcode then Set treats them as different and in this case equals is not called
     
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
     System.out.println(s3.hashCode());
     System.out.println(s4.hashCode());
     System.out.println(s5.hashCode());
     System.out.println(s6.hashCode());
     
	

	
	for (Student student : students){
		System.out.println(student);
	
	}
	Iterator<Student>it = students.iterator();
	while (it.hasNext()) {
		Student student = (Student) it.next();
		System.out.println(student);
		
	}
	}

	
	
     
	
}
