package com.pack.Hello;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Hib hb=new Hib();
    	Configuration con=new Configuration().configure().addAnnotatedClass(Hib.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session ss=sf.openSession();
    	ss.beginTransaction();
    	Query q1=ss.createQuery("from Hib where id=104");
    	hb=(Hib)q1.uniqueResult();
    	q1.setCacheable(true);
    	ss.beginTransaction().commit();
    	ss.close();
    	
    	Session sss=sf.openSession();
    	ss.beginTransaction();
    	Query q2=sss.createQuery("from Hib where id=104");
    	hb=(Hib)q2.uniqueResult();
    	q2.setCacheable(true);
    	sss.beginTransaction().commit();
    	sss.close();
    	
    	
    	
    	
    	
    }
}
