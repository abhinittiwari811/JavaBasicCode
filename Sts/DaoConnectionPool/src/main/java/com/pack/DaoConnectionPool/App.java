package com.pack.DaoConnectionPool;

import java.sql.Connection;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BasicDataSource bds=new BasicDataSource();
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/db");
        bds.setUsername("root");
        bds.setPassword("golu");
        bds.setMaxWaitMillis(1000*5);
        bds.setMaxIdle(5);
        bds.setMaxTotal(15);
        
        for(int i=1;i<=15;i++) {
        	
        	try {
        		Connection con=bds.getConnection();
        		System.out.println(con);
        		con.close();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
    }
}
