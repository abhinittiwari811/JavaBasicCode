package com.pack.Data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      
    	Laptop lp=new Laptop();
    	lp.setLid(2);
    	lp.setLname("Dell");
    	
    	
    	Student st=new Student();
    	st.setSname("Mohti");
    	st.setMark("452");
    	st.setSid(102);
    	st.getLaptop().add(lp);
    	lp.getStudent().add(st);
    	
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session ss=sf.openSession();
    	Transaction tx=ss.beginTransaction();
    	ss.save(st);
    	ss.save(lp);
    	tx.commit();
    	
    	
    }
}
