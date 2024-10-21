package hospital.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import hospital.entity.Patient;


public class SingleRecordFletch {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();	
		
		int patient_id=3;
		Patient p=ss.get(Patient.class,patient_id);
		
		System.out.println(p);
		System.out.println("single record fletch....");
		
		tr.commit();
		ss.close();
		
	}
}
