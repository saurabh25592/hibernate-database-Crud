package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class Update {

	public static void main(String[] args) {
	
		 Configuration cfg=new Configuration();
		   cfg.configure();
		   cfg.addAnnotatedClass(Employee.class);
		   
		   SessionFactory sf=cfg.buildSessionFactory();
		   Session ss=sf.openSession();
		   Transaction tr=ss.beginTransaction();
		   
		   int id=5;	   
		  Employee e= ss.get(Employee.class,id );
		  
		  e.setName("girish");
		  e.setSalary("89090");
		  e.setAge(27);
		
		  ss.merge(e);
//		  ss.update(e);
		  tr.commit();
		  
		  System.out.println("data updated....");
	}
	
}
