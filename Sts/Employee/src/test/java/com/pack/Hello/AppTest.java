package com.pack.Hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest{

		public static void main(String[] args) {
			
			EmpName em=new EmpName();
			em.setFname("abhinit");
			em.setMname("kumar");
			em.setLname("tiwari");
			
			
			Hib hb=new Hib();
			
			hb.setId(104);
			hb.setSalary("100000");
			hb.setEname(em);
			
			Configuration con=new Configuration().configure().addAnnotatedClass(Hib.class);
			SessionFactory sf=con.buildSessionFactory();
			Session ss=sf.openSession();
			Transaction tx=ss.beginTransaction();
			ss.save(hb);
			
			tx.commit();
			
		}

}
