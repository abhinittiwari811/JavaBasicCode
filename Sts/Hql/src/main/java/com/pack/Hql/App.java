package com.pack.Hql;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Random  rd=new Random();
        
    	
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session ss=sf.openSession();
    	Transaction tx=ss.beginTransaction();
		
		  Query q=ss.createQuery("from Student where mark > 50"); List<Student> student=q.list();
		  
		  for(Student s:student) System.out.println(s);
		 
    	
    	
		
		/*
		 * for(int i=1;i<=15;i++) { Student st=new Student();
		 * st.setMark(rd.nextInt(100)); st.setSid(i); st.setSname("Rahul "+i);
		 * ss.save(st); }
		 * 
		 * tx.commit();
		 */
		 
    }
}
