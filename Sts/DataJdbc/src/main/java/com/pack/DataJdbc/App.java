package com.pack.DataJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse", "root", "golu");
    	Statement st=con.createStatement();
    	ResultSet rs=st.executeQuery("select * from student");
    	while(rs.next()) {
    		
    		System.out.println(rs.getInt(1)+"  "+rs.getString(3));
    		
    	}
    	con.close();
    	st.close();
    }
}
