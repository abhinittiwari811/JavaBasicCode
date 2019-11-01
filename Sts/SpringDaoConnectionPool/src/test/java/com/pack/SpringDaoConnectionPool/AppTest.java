package com.pack.SpringDaoConnectionPool;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    
{
	public static void main(String args[]) {
	 BasicDataSource bds =new BasicDataSource();
	    bds.setDriverClassName("com.mysql.jdbc.Driver");
	    bds.setUrl("jdbc:mysql://localhost:3306/eclipse");
	    bds.setUsername("root");
	    bds.setPassword("golu");
	    bds.setMaxActive(15);
	    bds.setMaxIdle(5);
	    bds.setMaxWait(1000*5);
	    
	    for(int i=1;i<15;i++) {
	    	
	    	try {
	    Connection con=bds.getConnection();
	    System.out.println(con+" "+i);
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    
	    }
}
}