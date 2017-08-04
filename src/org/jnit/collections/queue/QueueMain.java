package org.jnit.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Queue(I) extends Collections(I)
//Linkedlist and Priority queue are implementations for queue
public class QueueMain {

	public static void main(String[] args) {
		// FIFO = First elt inserted is the one which comesout first

		Queue<String> q = new LinkedList<String>();
		q.add("Apple");
		q.add("Orange");
		q.add("Mango");
		q.offer("Pineapple");

		for (String st : q) {
			System.out.println(st);
		}
		// q.peek() returns null if there is no elt,q.element() throws a
		// NoSuchElementException

		System.out.println("Element at the head is:" + q.peek());// examine elt
																	// at the
																	// head of
																	// the
																	// queue,we
																	// can also
																	// use
																	// q.element()
		System.out.println(q);
		System.out.println(q.poll());// or q.remove()-removes the elt from head
										// of the queue-q.remove() trhows an
										// exception if there is no element
		System.out.println("Queue after removing the head is:" + q);

		Queue<String> pq = new PriorityQueue<String>();

		pq.add("Apple");
		pq.add("Orange");
		pq.add("Mango");
		pq.offer("Pineapple");
		
		
		//Stores the elt with defined priority by the comparator
		
		Queue<Patient> patientQueue = new PriorityQueue<>(new PatientComparator());
		patientQueue.add(new Patient(1,"Patient1",false));
		patientQueue.add(new Patient(2,"Patient2",false));
		patientQueue.add(new Patient(3,"Patient3",true));
		patientQueue.add(new Patient(4,"Patient4",false));
		patientQueue.add(new Patient(5,"Patient5",true));
		
			System.out.println();
			System.out.println("Doctors waiting for patients :");
			while(true){
				Patient currentPatient = patientQueue.poll();
				if(currentPatient == null){
					break;
				}
				System.out.println(currentPatient.getName() + "<--");
			}
		System.out.println();
	}

}
