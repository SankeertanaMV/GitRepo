package org.jnit.collections.queue;
import java.util.Comparator;
public class PatientComparator implements Comparator<Patient> {

	
	public int compare(Patient patient1,Patient patient2){
		return(patient1.isEmergencyCase()) == patient2.isEmergencyCase() ? (Integer.valueOf(patient1.getId()).compareTo(patient2.getId())) : (patient1.isEmergencyCase() ? -1 : 1)  ;
		
	}
}
