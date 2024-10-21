package vehicle.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vehicle.entity.Vehicle;



public class Update {

	public static void main(String[] args) {

	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Vehicle.class);
	
	  SessionFactory sf=cfg.buildSessionFactory();
	  Session ss=sf.openSession();
	  Transaction tr=ss.beginTransaction();
	  
	  int car_id=4;
	  
	  Vehicle p=ss.get(Vehicle.class, car_id);
	
	  p.setBrand_name("ford");
      p.setModel_name("xuv");
      p.setPrice(789900);
      p.setColor("bloe");
	 
      ss.merge(p);
	  tr.commit();
	  System.out.println("data updated");
	  
	  ss.close();
		
	}
	
	
}
