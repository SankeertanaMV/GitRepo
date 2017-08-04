package org.jnit.collections.setdemo;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Teacher> {
	

		@Override
		public int compare(Teacher o1, Teacher o2) {
			return o1.getFirstname().compareTo(o2.getFirstname());
		}
		

	}
