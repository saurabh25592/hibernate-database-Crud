package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class Delete {

	
	public static void main(String[] args) {
		
	
  Configuration cfg=new Configuration();
   cfg.configure();
   cfg.addAnnotatedClass(Employee.class);
   
   SessionFactory sf=cfg.buildSessionFactory();
   Session ss=sf.openSession();
   Transaction tr=ss.beginTransaction();
   
   int id=2;	   
  Employee e= ss.get(Employee.class,id );
   
   ss.remove(e);
   System.out.println("Data is deleted........");
   
   tr.commit();
   ss.close();
	
	}
}
