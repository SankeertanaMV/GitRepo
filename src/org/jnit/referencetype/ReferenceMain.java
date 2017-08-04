package org.jnit.referencetype;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import org.jnit.objectcommunication.Employee;

//Strong ref-so far what we have used is strong ref, new is used to create strong ref
// Weak ref- JVM does the GC early-weak ref are most suitable for storing meta data
//Soft ref- JVM doesnot perform GC on these ref's until they absolutely need memory
//Phantom ref-JVM performs GC whenever it feels like removing them
public class ReferenceMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp=null;
		
		Employee emp1 = new Employee();
		WeakReference<Employee>wemp = new WeakReference<Employee>(emp1);//GC is eager in the case of weak ref
		SoftReference<Employee>semp = new SoftReference<Employee>(emp1);
		ReferenceQueue<Employee> refQueue = new ReferenceQueue<Employee>();//ref will be stored in this queue foe cleanup
		
		PhantomReference<Employee>pemp = new PhantomReference<Employee>(emp1,refQueue);
		emp1 = null;//no ref can stop emp1 from being garbage collected
		
	   
		

	}

}
