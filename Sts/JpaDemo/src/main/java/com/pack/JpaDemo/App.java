package com.pack.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pc");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	Student st=em.find(Student.class, 5);
    	System.out.println(st.getSid());
    	em.getTransaction().commit();
    	
    }
}
