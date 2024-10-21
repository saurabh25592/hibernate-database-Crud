package vehicle.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vehicle.entity.Vehicle;

public class Delete {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int car_id = 52;
		Vehicle v = ss.get(Vehicle.class, car_id);

		ss.remove(v);
		System.out.println("data is deleted....");

		tr.commit();
		ss.close();

	}
}
