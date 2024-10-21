package vehicle.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vehicle.entity.Vehicle;

public class Insert {

  public static void main(String[] args) {
	
	  Configuration cfg=new Configuration();
	  cfg.configure("hibernate.cfg.xml");
	  cfg.addAnnotatedClass(Vehicle.class);
	 
	  SessionFactory sf=cfg.buildSessionFactory();
	  Session ss=sf.openSession();
	  Transaction tr=ss.beginTransaction();
	  
	  Vehicle v=new Vehicle();
	  v.setCar_id(4);
	  v.setModel_name("ford");
	  v.setBrand_name("creata");
	  v.setPrice(120000);
	  v.setColor("black");
	  
	  ss.persist(v);	  
	  tr.commit();

	  System.out.println("data inserted....");
	  ss.close(); 
	  
	  
	}
	
}
