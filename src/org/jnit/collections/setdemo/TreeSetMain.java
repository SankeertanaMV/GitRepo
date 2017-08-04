package org.jnit.collections.setdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		Set<String>colors = new TreeSet<>();
		colors.add("yellow");
		colors.add("red");
		colors.add("blue");
		colors.add("pink");
		colors.add("brown");
		colors.add("red");
		System.out.println(colors.size());//red is dupe hence size is 4
		System.out.println(colors);//prints out sorted colors in an alphebetical order
		
		Set<Teacher>sortedTeacherSet = new TreeSet<>(new FirstNameComparator());
		Teacher t1 = new Teacher("Joe","Albert","Math");
		Teacher t2 = new Teacher("John","Albert","Science");
		Teacher t3 = new Teacher("Mary","Thomas","Physics");
		Teacher t4 = new Teacher("Mary","Thom","Physics");
		sortedTeacherSet.add(t1);
		sortedTeacherSet.add(t2);
		sortedTeacherSet.add(t3);
		sortedTeacherSet.add(t4);
		System.out.println(sortedTeacherSet.size( ));
		System.out.println(sortedTeacherSet);
		
		

	}

}
