package vehicle.main;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import vehicle.entity.Vehicle;

public class FletchAllData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		CriteriaBuilder cb = ss.getCriteriaBuilder();
		CriteriaQuery<Vehicle> cq = cb.createQuery(Vehicle.class);
		Root<Vehicle> root = cq.from(Vehicle.class);
		cq.select(root);
		Query query = ss.createQuery(cq);

		List<Vehicle> list = query.getResultList();

		for (Vehicle vehicle : list) {
			System.out.println(vehicle);
		}

	}

}
